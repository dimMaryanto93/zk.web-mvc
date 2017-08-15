# ZK Framework with MVC pattern

MVC is ...

membuat project dengan maven archetype zk-archetype-webapp

```bash
mvn archetype:generate -Dpackage=belajar.zk -DgroupId=com.dimas.maryanto.zk -DartifactId=zk.web-mvc -Dversion=1.0-SNAPSHOT -DarchetypeGroupId=org.zkoss -DarchetypeArtifactId=zk-archetype-webapp
```

Tambahkan dependency `org.projectlombok` untuk memudahkan dalam membuat POJO (Plain Old Java Object)

```xml
<dependency>
    <groupId>org.projectlombok</groupId>
    <artifactId>lombok</artifactId>
    <version>1.16.18</version>
</dependency>
```