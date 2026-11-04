# INF4067:UML & Design Patterns - Principes SOLID

## 1. Présentation du Projet
Ce projet global s'inscrit dans le cadre du cours **INF4067** et regroupe l'implémentation pratique des **5 principes SOLID** de la conception orientée objet. L'objectif est d'illustrer les problèmes de couplage et de rigidité d'une mauvaise conception, puis d'appliquer les *refactorings* nécessaires pour obtenir un code modulaire, maintenable et extensible.

---

## 2. Structure Globale de l'Arborescence
Le dépôt est organisé par principe SOLID sous un dossier racine unique :

```text
INF4067_Principe_SOLID/
│
├── SRP/   (Single Responsibility Principle)
├── OCP/   (Open-Closed Principle)
├── LSP/   (Liskov Substitution Principle)
├── ISP/   (Interface Segregation Principle)
├── DIP/   (Dependency Inversion Principle)
└── README.md
```
## 3. Résumé des Principes SOLID Implémentés

* **SRP (Single Responsibility Principle) :** Une classe ne doit avoir qu'une seule raison d'être modifiée. Le code initial mélangeant données, affichage, persistance et métier a été séparé en entités dédiées (`BookSRP`, `BookPrinter`, `BookSaver`, `BookBusinessLogic`).

* **OCP (Open-Closed Principle) :** Les entités doivent être ouvertes à l'extension et fermées à la modification. L'utilisation d'interfaces (`Shape`) et du polymorphisme évite les structures conditionnelles rigides (`instanceof`).

* **LSP (Liskov Substitution Principle) :** Les sous-types doivent être substituables à leur type de base sans altérer le comportement du programme. L'héritage inadapté a été remplacé par des implémentations d'interfaces cohérentes (`Shape`).

* **ISP (Interface Segregation Principle) :** Préférer de petites interfaces ciblées plutôt qu'une "BigInterface" globale pour ne pas forcer les classes à implémenter des méthodes inutiles.

* **DIP (Dependency Inversion Principle) :** Les modules de haut niveau ne doivent pas dépendre des modules de bas niveau, mais tous deux dépendre d'abstractions (`Database`).

#### NB: Pour mieux comprendre chaque principe il faut aller lire le README.md contenu dans le dossier du principe qui vous interesse (exemple: `chemin/vers/INF4067_Principe_SOLID/SRP/README.md `)
---

## 4. Comment tester les modules ?

Chaque sous-dossier (`SRP`, `OCP`, `LSP`, `ISP`, `DIP`) contient son propre fichier de test exécutable (`Main.java`) permettant de valider l'architecture de manière indépendante et sans gestionnaire de paquets complexe.

### Étapes d'exécution génériques :

1. **Ouvrez votre terminal** et positionnez-vous dans le sous-dossier du principe que vous souhaitez tester (par exemple `SRP`) :
   ```bash
   cd chemin/vers/INF4067_Principe_SOLID/SRP
2. Compilez l'ensemble des fichiers Java du dossier pour générer les fichiers .class :
   ```bash
   javac *.java
   ```
3. Exécutez le programme de test via la classe principale Main
   ```bash
   java Main
   ```