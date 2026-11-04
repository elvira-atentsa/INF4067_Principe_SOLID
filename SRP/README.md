# Module SRP (Single Responsibility Principle)

## 1. Contexte et Origine du Projet
Ce projet s'inscrit dans le cadre du cours de **Principes SOLID** (Module `INF4067_Principe_SOLID`). 

À l'origine, une mauvaise conception consiste à regrouper plusieurs responsabilités au sein d'une seule et même classe (par exemple, une classe unique `Book` qui gère à la fois les données, l'affichage, la persistance et la logique métier). Cela provoque un **fort couplage** et une **faible maintenabilité**, car toute modification d'un aspect force la modification de la classe entière.

---

## 2. Pourquoi ce code a-t-il été écrit ? (Objectif du SRP)
Le **Principe de Responsabilité Unique (Single Responsibility Principle - SRP)** stipule qu'**une classe doit avoir une et une seule raison d'être modifiée**, ce qui signifie qu'elle ne doit porter qu'**une seule responsabilité**.

Pour remédier au problème du couplage, nous avons appliqué un *refactoring* en séparant les responsabilités en **4 classes distinctes** :
1. **`BookSRP` (Modèle de données / Entité) :** Gère uniquement les attributs du livre et l'accès aux données (getters).
2. **`BookPrinter` (Présentation) :** Gère l'affichage des informations du livre (écran, format HTML, etc.).
3. **`BookSaver` (Persistance) :** Gère la sauvegarde des données (en base de données, dans un fichier, etc.).
4. **`BookBusinessLogic` (Logique métier) :** Gère les règles métier telles que l'emprunt du livre par un lecteur.

---

## 3. Structure de l'Arborescence
Le projet est organisé de la manière suivante sous la racine `INF4067_Principe_SOLID` :

```text
INF4067_Principe_SOLID/
│
└── SRP/
    ├── BookSRP.java
    ├── BookPrinter.java
    ├── BookSaver.java
    ├── BookBusinessLogic.java
    ├── Main.java
    └── README.md
```   
## 4. Comment tester le code ?

Pour tester le bon fonctionnement de l'architecture sans utiliser de gestionnaire de paquets complexe, un fichier de test exécutable (`Main.java`) est placé directement dans le même dossier.

### Étapes d'exécution en ligne de commande :

1. **Ouvrez votre terminal** et positionnez-vous dans le dossier contenant les fichiers sources :
   ```bash
   cd chemin/vers/INF4067_Principe_SOLID/SRP
   ```
2. Compilez l'ensemble des fichiers Java du dossier pour générer les fichiers .class :
   ```bash
   javac *.java
   ```
3. Exécutez le programme de test via la classe principale Main
   ```bash
   java Main
   ```