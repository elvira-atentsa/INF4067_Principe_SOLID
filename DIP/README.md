# Module DIP (Dependency Inversion Principle)

## 1. Contexte et Origine du Projet
Ce projet s'inscrit dans le cadre du cours de **Principes SOLID** (Module `INF4067_Principe_SOLID`). 

À l'origine, une mauvaise conception consiste à faire dépendre directement les modules de haut niveau (comme la classe métier `OrderProcessor`) de modules de bas niveau concrets et spécifiques (comme `MySQLDatabase` instanciée en dur dans le code). Cela crée un fort couplage, rendant l'application rigide et impossible à réutiliser ou à modifier sans impacter le code existant.

---

## 2. Pourquoi ce code a-t-il été écrit ? (Objectif du DIP)
Le **Principe d'Inversion de Dépendance (Dependency Inversion Principle - DIP)** stipule que les modules de haut niveau ne doivent pas dépendre de modules de bas niveau, mais tous deux doivent dépendre d'abstractions. De plus, les détails doivent dépendre des abstractions.

Pour remédier au problème du fort couplage, nous avons appliqué un *refactoring* en introduisant une interface et l'injection de dépendances :
1. **`Database` (Interface / Abstraction) :** Définit le contrat universel de persistance (`save(String data)`).
2. **`MySQLDatabase` & `MongoDBDatabase` (Implémentations concrètes) :** Réalisent les détails de bas niveau en implémentant l'interface `Database`.
3. **`OrderProcessor` (Module de haut niveau) :** Dépend uniquement de l'abstraction `Database` (reçue par injection de dépendance via le constructeur), ce qui le rend indépendant de la technologie de stockage utilisée**.

---

## 3. Structure de l'Arborescence
Le projet est organisé de la manière suivante sous la racine `INF4067_Principe_SOLID` :

```text
INF4067_Principe_SOLID/
│
└── DIP/
    ├── Database.java
    ├── MySQLDatabase.java
    ├── MongoDBDatabase.java
    ├── OrderProcessor.java
    ├── Main.java
    └── README.md
```   
## 4. Comment tester le code ?

Pour tester le bon fonctionnement de l'architecture sans utiliser de gestionnaire de paquets complexe, un fichier de test exécutable (`Main.java`) est placé directement dans le même dossier.

### Étapes d'exécution en ligne de commande :

1. **Ouvrez votre terminal** et positionnez-vous dans le dossier contenant les fichiers sources :
   ```bash
   cd chemin/vers/INF4067_Principe_SOLID/DIP
   ```
2. Compilez l'ensemble des fichiers Java du dossier pour générer les fichiers .class :
   ```bash
   javac *.java
   ```
3. Exécutez le programme de test via la classe principale Main
   ```bash
   java Main
   ```