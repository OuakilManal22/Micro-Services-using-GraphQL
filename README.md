# Micro-Services-using-GraphQL
GraphQL est un langage de requête et une technologie de serveur qui permet aux clients de demander précisément les données dont ils ont besoin à partir d'un serveur, contrairement aux API REST traditionnelles où le serveur définit les structures de données et renvoie des réponses prédéfinies. Parmi les avantages qu'il offre:
Flexibilité des requêtes : GraphQL permet aux clients de spécifier les champs de données qu'ils souhaitent récupérer, évitant ainsi les surcharges de données inutiles.
Structure de type : Les données exposées via GraphQL sont organisées en types et champs. Chaque type définit les données qu'il contient, et les clients peuvent interroger ces champs de manière récursive pour obtenir des données liées.
Une seule requête pour plusieurs ressources : Au lieu de devoir effectuer plusieurs requêtes pour récupérer des données de différentes ressources, GraphQL permet de regrouper ces requêtes en une seule, réduisant ainsi le nombre de requêtes HTTP.
Dans cette application, nous développerons des microservices pour gérer les entités "Bank Account" et "Customer". 
BankAccount : Cette classe représente les informations liées aux comptes bancaires, telles que le solde, le numéro de compte, et d'autres détails pertinents. En exposant ces données via GraphQL, les clients pourront spécifier les champs exacts qu'ils souhaitent récupérer, évitant ainsi les surcharges de données inutiles.
Customer  : Elle contient les informations relatives aux clients de la banque, avec GraphQL, les clients pourront interroger ces données de manière spécifique améliorant ainsi les performances et l'efficacité.

Un extrait du schéma GraphQL:
![image](https://github.com/OuakilManal22/Micro-Services-using-GraphQL/assets/105586177/7991c0a9-dc17-461b-828a-89fff14d39c3)

Ce schéma décrit la structure de données et les opérations que le serveur GraphQL peut gérer, ce qui permet aux utilisateurs de poser des questions et d'effectuer des mutations sur ces données de manière précise et flexible. 


L'interface GraphiQL:

![image](https://github.com/OuakilManal22/Micro-Services-using-GraphQL/assets/105586177/79a5531c-f208-436d-9f71-b1cfa66094db)


GraphiQL est un environnement de développement interactif destiné à l'exploration et au test des serveurs GraphQL. Il offre une interface web conviviale qui permet aux développeurs de créer, tester et déboguer des requêtes GraphQL de manière simple et efficace. Parmi ses avantages:

 - Interface interactive.
 - Syntaxe et complétion automatique.
 - Documentation intégrée.
 - Historique des requêtes.
 - Validation et débogage. 
 - Environnement de test.
 - Personnalisable.




