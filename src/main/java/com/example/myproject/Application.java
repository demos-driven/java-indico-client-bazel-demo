package com.example.myproject;

import com.indico.IndicoClient;
import com.indico.IndicoConfig;
import com.indico.IndicoKtorClient;
import com.indico.entity.Workflow;
import com.indico.query.ListWorkflows;

import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.Properties;

public class Application {

    public static void main(String[] args) throws IOException {
        Properties properties = new Properties();
        // TODO bazel file path resolve
        properties.load(new FileReader("config.properties"));

        IndicoConfig config = new IndicoConfig.Builder()
                .host(properties.getProperty("host"))
                .apiToken(properties.getProperty("apiToken"))
                .build();

        IndicoClient client = new IndicoKtorClient(config);

        ListWorkflows listWorkflows = new ListWorkflows(client);
        List<Workflow> workflows = listWorkflows.query();
        for (Workflow workflow : workflows) {
            System.out.printf("workflowId: %d, name: %s, reviewEnabled: %b\n", workflow.id, workflow.name, workflow.reviewEnabled);
        }
    }
}
