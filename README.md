# Carregando propriedades com @ConfigurationProperties no Micronaut

## Mais detalhes consulte o artigo no link: 

## Como rodar o projeto ?
`./gradlew run`

## Saída esperada

```
10:48:27.447 [main] INFO  q.m.p.bind.ApplicationListener - ThreadConfig [max=10, min=1]
10:48:27.459 [main] INFO  q.m.p.bind.ApplicationListener - MyAppConfigurations [maxUsers=100, schedule=ScheduleConfig [maxDate=2021-10-11, minDate=2021-09-11], thread=ThreadConfig [max=10, min=1]]
```