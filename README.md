# Java framework for Cadence
[Cadence](https://github.com/uber/cadence) is a distributed, scalable, durable, and highly available orchestration engine we developed at Uber Engineering to execute asynchronous long-running business logic in a scalable and resilient way.

`cadence-client` is the framework for authoring workflows and activities in Java.

If you are authoring in Go, see [Go Cadence Client](https://github.com/uber-go/cadence-client).

## Samples

For samples, see [Samples for the Java Cadence client](https://github.com/mfateev/uber-java-cadence-samples).

## Run Cadence Server

Run Cadence Server using Docker Compose:

    curl -O https://raw.githubusercontent.com/uber/cadence/master/docker/docker-compose.yml
    docker-compose up

If this does not work, see instructions for running the Cadence Server at https://github.com/uber/cadence/blob/master/README.md.

## Build a configuration

Add *cadence-client* as a dependency to your *pom.xml*:

    <dependency>
      <groupId>com.uber</groupId>
      <artifactId>cadence-client</artifactId>
      <version>0.2.0-SPANPSHOT</version>
    </dependency>

## Contributing
We'd love your help in making Cadence-client great. Please review our [instructions](CONTRIBUTING.md).

## License
MIT License, please see [LICENSE](LICENSE) for details.


