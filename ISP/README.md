# Module ISP (Interface Segregation Principle)

## 1. Contexte et Origine du Projet
Ce projet s'inscrit dans le cadre du cours de **Principes SOLID** (Module `INF4067_Principe_SOLID`). 

À l'origine, une mauvaise conception consiste à utiliser une "BigInterface" globale (par exemple, une interface unique `Worker` regroupant à la fois les méthodes `work()` et `eat()`). Cela force des classes comme les robots à implémenter des méthodes dont elles n'ont pas besoin ou qui n'ont pas de sens pour elles, générant des exceptions ou du code inutile.

---

## 2. Pourquoi ce code a-t-il été écrit ? (Objectif de l'ISP)
Le **Principe de Ségrégation des Interfaces (Interface Segregation Principle - ISP)** stipule qu'**un client ne doit jamais être forcé d'implémenter des méthodes dont il ne se sert pas**, ce qui conduit à préférer de petites interfaces ciblées.

Pour remédier au problème des interfaces trop larges, nous avons appliqué un *refactoring* en séparant les fonctionnalités en **plusieurs petites interfaces et classes distinctes** :
1. **`Workable` (Interface de travail) :** Définit uniquement le comportement lié au travail (`work()`).
2. **`Eatable` (Interface d'alimentation) :** Étend `Workable` pour y ajouter le comportement de restauration (`eat()`).
3. **`HumanWorker` (Classe Humain) :** Implémente `Eatable` pour gérer à la fois le travail et l'alimentation.
4. **`RobotWorker` (Classe Robot) :** Implémente uniquement `Workable` car un robot n'a pas besoin de manger.

---

## 3. Structure de l'Arborescence
Le projet est organisé de la manière suivante sous la racine `INF4067_Principe_SOLID` :

```text
INF4067_Principe_SOLID/
│
└── ISP/
    ├── Workable.java
    ├── Eatable.java
    ├── HumanWorker.java
    ├── RobotWorker.java
    ├── Main.java
    └── README.md

```   
## 4. Comment tester le code ?

Pour tester le bon fonctionnement de l'architecture sans utiliser de gestionnaire de paquets complexe, un fichier de test exécutable (`Main.java`) est placé directement dans le même dossier.

### Étapes d'exécution en ligne de commande :

1. **Ouvrez votre terminal** et positionnez-vous dans le dossier contenant les fichiers sources :
   ```bash
   cd chemin/vers/INF4067_Principe_SOLID/ISP
   ```
2. Compilez l'ensemble des fichiers Java du dossier pour générer les fichiers .class :
   ```bash
   javac *.java
   ```
3. Exécutez le programme de test via la classe principale Main
   ```bash
   java Main
   ```