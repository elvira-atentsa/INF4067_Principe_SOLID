# Module LSP (Liskov Substitution Principle)

## 1. Contexte et Origine du Projet
Ce projet s'inscrit dans le cadre du cours de **Principes SOLID** (Module `INF4067_Principe_SOLID`). 

À l'origine, une mauvaise conception (comme faire hériter un carré d'un rectangle de manière naïve, où `Square extends Rectangle`) viole le principe de substitution de Liskov. Modifier la largeur ou la hauteur d'un rectangle ne se comporte pas de la même manière pour un carré, ce qui fausse les résultats et brise le contrat attendu des classes parentes.

---

## 2. Pourquoi ce code a-t-il été écrit ? (Objectif du LSP)
Le **Principe de Substitution de Liskov (Liskov Substitution Principle - LSP)** stipule qu'un sous-type doit pouvoir être substitué à son type de base dans toute l'application sans causer de comportement non désiré dans le programme.

Pour remédier au problème d'héritage inadapté, nous avons appliqué un *refactoring* en évitant l'héritage direct entre formes et en s'appuyant sur une interface commune :
1. **`Shape` (Interface) :** Définit le contrat universel via la méthode `getArea()`.
2. **`Rectangle` (Implémentation) :** Implémente `Shape` en gérant indépendamment sa largeur et sa hauteur.
3. **`Square` (Implémentation) :** Implémente `Shape` en gérant spécifiquement son côté unique, garantissant une substitution sûre et sans effet de bord.

---

## 3. Structure de l'Arborescence
Le projet est organisé de la manière suivante sous la racine `INF4067_Principe_SOLID` :

```text
INF4067_Principe_SOLID/
│
└── LSP/
    ├── Shape.java
    ├── Rectangle.java
    ├── Square.java
    ├── Main.java
    └── README.md
```   
## 4. Comment tester le code ?

Pour tester le bon fonctionnement de l'architecture sans utiliser de gestionnaire de paquets complexe, un fichier de test exécutable (`Main.java`) est placé directement dans le même dossier.

### Étapes d'exécution en ligne de commande :

1. **Ouvrez votre terminal** et positionnez-vous dans le dossier contenant les fichiers sources :
   ```bash
   cd chemin/vers/INF4067_Principe_SOLID/LSP
   ```
2. Compilez l'ensemble des fichiers Java du dossier pour générer les fichiers .class :
   ```bash
   javac *.java
   ```
3. Exécutez le programme de test via la classe principale Main
   ```bash
   java Main
   ```