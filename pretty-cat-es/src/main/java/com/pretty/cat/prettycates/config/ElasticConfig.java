package com.pretty.cat.prettycates.config;

import org.elasticsearch.client.Client;
import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.common.transport.InetSocketTransportAddress;
import org.elasticsearch.transport.client.PreBuiltTransportClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.elasticsearch.core.ElasticsearchTemplate;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;

import java.net.InetAddress;

@Configuration
@EnableElasticsearchRepositories(basePackages = "com.pretty.cat.prettycates.repository")
public class ElasticConfig {
//	private static Logger log = LoggerFactory.getLogger(ElasticConfig.class);

//	@Bean
//	public Client client() {
//		TransportClient client = null;
//		try {
//			client = new PreBuiltTransportClient(Settings.EMPTY)
//					.addTransportAddress(new InetSocketTransportAddress(InetAddress.getByName("host1"), 9300));
//
//		} catch (Exception e) {
//			log.error(e.toString());
//		}
//		return client;
//	}
//
//	@Bean
//	public ElasticsearchTemplate elasticsearchTemplate(Client client) throws Exception {
//		return new ElasticsearchTemplate(client);
//	}
}