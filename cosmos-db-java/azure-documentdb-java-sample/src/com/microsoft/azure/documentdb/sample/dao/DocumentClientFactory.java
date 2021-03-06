package com.microsoft.azure.documentdb.sample.dao;

import com.microsoft.azure.documentdb.ConnectionPolicy;
import com.microsoft.azure.documentdb.ConsistencyLevel;
import com.microsoft.azure.documentdb.DocumentClient;

public class DocumentClientFactory {
    private static final String HOST = "https://cosmoslabs.documents.azure.com:443/";
    private static final String MASTER_KEY = "nONrQWCvS6VyZ4DyI3GQjdQkGn0I5u5Vqpxs042NcGXsyofMgytPfamnc9W9lQfEeq2afoDQDmCwfubS7a1UiA==";

    private static DocumentClient documentClient;

    public static DocumentClient getDocumentClient() {
        if (documentClient == null) {
            documentClient = new DocumentClient(HOST, MASTER_KEY,
                    ConnectionPolicy.GetDefault(), ConsistencyLevel.Session);
        }

        return documentClient;
    }

}
