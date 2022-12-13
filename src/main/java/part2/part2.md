# Dad Jokes

Hier soll es möglich sein Dad Jokes von der unten angegeben URL abzurufen.
Es soll ein Konsolendialog erstellt werden der drei vordefinierten Dads beliebig viele Witze hinzufügt.

Für jeden Witz soll ein entsprechendes Objekt erstellt werden und dem jeweiligen Vater zugeordnet werden.
Die Witze müssen in eine selbst programmierten Array, welches jeweils dem Vaterobjekt
zugeordnet wird gespeichert werden.

Bevor du mit der Implementierung startest, mache dich mit der API vertraut.
Das geht zum Beispiel mit curl
~~~shell
curl -H "Accept: application/json" https://icanhazdadjoke.com/
~~~
Mit Postman, dem Browser oder HTTPie geht es natürlich genauso.

Schlussendlich soll die Anwendung erweitert werden und die Möglichkeit nach bestimmten Witzen zu suchen.

Achte auch darauf, dass alle Klassen entsprechende `toString()` Methoden besitzten. Beim Dad sollen alle Witze die er 
kennt ausgegeben werden.

> Alle Maven Dependencies sind schon vorkonfiguriert.