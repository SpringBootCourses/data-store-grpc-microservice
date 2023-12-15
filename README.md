# Data store gRPC microservice

This is data store gRPC microservice
for [YouTube course](https://www.youtube.com/playlist?list=PL3Ur78l82EFA3fe4ltz7I4Z4_FKZ1PEBq).

This application receives data
from [Data analyser service](https://github.com/IlyaLisov/data-analyser-grpc-microservice)
with gRPC.

### Usage

To start an application you need to pass variables to `.env` file.

You can find Docker compose file
in [Data analyser gRPC service](https://github.com/IlyaLisov/data-analyser-grpc-microservice) `docker/docker-compose.yaml`.

Application is running on port `8083`.

All insignificant features (checkstyle, build check, dto validation) are not
presented.

#### Example:

```agsl
REDIS_HOST=localhost
REDIS_PORT=6379
BATCH_SIZE=3
```

Just after startup application will try to connect to gRPC server and begin to
fetch batch updates of `BATCH_SIZE` every 10s.
