# funzionamento git
apri il terminale con 'Cntrl + Alt + T'

spostati nella directory locale in cui vuoi fare la cartella  
esempio **Scrivania**  
`cd Scrivania`

crea una cartella **algoritmi** (facoltativo, ma utile per tenere altre repository di algoritmi)  
`mkdir algoritmi`  
e spostati nella cartella appena creata  
`cd !$` equivalente a `cd algoritmi`

oppure **/GITHUB/algoritmi**
`mkdir /GITHUB/algoritmi/`  
`cd !$`

clona la repository per fare esperimenti  
`git clone git@github.com:giusdp/hangman-java.git`

## per contruibuire a questa repository
se vuoi contribuire fai una **fork** (pulsante su github)
fai le modifiche che vuoi fare  
`git add .`  
`git commit -m 'COMMENTO DELLE TUE MODIFICHE TRA VIRGOLETTE SEMPLICI O DOPPIE'`

e pushale sulla tua fork  
`git push`

quando hai finito di fare modifiche
chiedi una **pull request** (pulsante su github)

# per eseguire questo su terminale

## controlla di aver `javac` e `java` installato
`javac --version`  
`java --version`

se non li hai cercali su internet e installali sulla tua macchina

## esecuzione su Terminale Linux (no IDE required)
spostati nella directory **src**  
`cd hangman-java/src`

compila i **.java** nei **.class** corrispondenti  
`javac *.java`  
NOTA BENE: questo comando non è equivalente a fare `javac *` all'inizio (quando non ci sono i **.class**) perchè viene richiesto esplicitamente da javac che siano **.java** quindi va sempre specificato con `javac *.java`

`java Main`

# come scrivere le cartelle in modo che siano facilmente 'pacchettizzabili'

supponi di volere un progetto con queste cartelle

```text
	src ----+-- Main.java
		+-- Test.java
		+-- animali --+-- Animal.java
			      +-- Gatto.java
			      +-- Cane.java
		+-- persone --+-- Persona.java
			      +-- Studente.java 
```

allora ci sarà una cartella **src**  
con dentro **Main.java**, **Test.java**,  
**animali** che è una cartella corrispondente al package animali  
e dentro i **.java** del package animali  
**persone** che è una cartella corrispondente al pakcage persone  
e dentro i **.java** del package persone  

questo codice ha tutti i file vuoti e crea i **.java** dentro le cartelle giuste  
creo i file con il comando `cat` per farvi vedere che dentro la prima riga è o no
quella del package ma potete crearla con il vostro editor preferito
```
cd src
cat > Main.java
cat > Test.java
mkdir animali
cd !$
cat 'package animali;' >> Animal.java
cat 'package animali;' >> Gato.java
cat 'package animali;' >> Cane.java
cd ..
mkdir persone
cat 'package persone;' >> Persona.java
cat 'package persone;' >> Studente.java
```

a voi e al vostro editor preferito scrivere quello che vi serve  
(include, classi, classi astratte/concrete, interfacce, enum...) 

