# ZK Framework with MVC pattern

Di project ini kita akan membuat sebuah web aplikasi dengan framework ZK 
menggunakan pendekatan MVC (Model View Controller) dengan contoh kasus 
menampilkan data ke tableview dan pencariannya. kurang lebih seperti gambar berikut:

![Contoh interface](images/details.png)

Pada dasarnya, tampilan tersebut terbagi menjadi 3 area yaitu 
- pencarian, 
- daftar semua mobil dan 
- detail mengenai mobil-mobil yang di seleksi di table.

### Membuat project dengan maven archetype zk-archetype-webapp

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

## Membuat User Interface (View)

ZK framework mendefinisikan GUI dengan ZUML (ZK User Interface Markup Language) 
yang basicly menggunakan bahasa XML meskipun bisa juga menggunakan 
template engine lain seperti `JSP`, `Velocity` dll. 
tapi di project ini kita akan menggunakan default ZK yaitu `.zul`

Berikut adalah contoh tag `.zul` untuk mendesign user interface di ZK Framework dengan ZUML.

```xml
<zk>
    <window title="Daftar Harga Mobil" width="600px" border="normal">
        <!-- sisipkan child tags here-->
    </window>
</zk>
```

**Note** yang perlu diperhatikan!!

Semua components dalam ZK Components contohnya seperti `textbox`, `checkbox`, `datebox` dan lain-lain 
harus berada dalam tags `<window>...</window>`
