# SOAPWebService
Au cours de ce travail pratique (TP), nous avons développé un service web que nous avons baptisé "BanqueService" et nous l'avons mis en service sur un serveur nommé "jaxws".
En outre, nous avons examiné et étudié le WSDL (Web Services Description Language) en utilisant un navigateur HTTP.
Par la suite, nous avons effectué des tests sur les opérations fournies par ce service en utilisant l'outil SOAPUI.
Enfin, nous avons créé un client Java qui implémentera ce service web en utilisant un intergiciel (middleware) appelé "stub".

![tp1](https://github.com/ghitaahmadi/SOAPWebService/assets/97565150/a1c6c09f-c5b8-4f2b-8a14-578c5a9ec8a3)

Création du Web service BanqueService

![TP2](https://github.com/ghitaahmadi/SOAPWebService/assets/97565150/cf13d02d-4b6a-4e5b-af25-7778b2f9ba13)

Création de la classe Compte

![TP3](https://github.com/ghitaahmadi/SOAPWebService/assets/97565150/778644b9-b783-4e85-81b4-0d9cc986f34d)

Création du serveur JaxWS

Spécification de l'adresse du serveur ainsi que l'instance du web service utilisé

En définissant l'adresse IP comme "0.0.0.0", le service web devient accessible via toutes les interfaces réseau de la machine. En d'autres termes, cela signifie que le service est ouvert aux requêtes de toutes les adresses IP, qu'elles proviennent du réseau local ou du réseau externe, ce dernier cas étant applicable si la machine dispose de plusieurs interfaces réseau.

![tp5](https://github.com/ghitaahmadi/SOAPWebService/assets/97565150/bdf09c88-3047-4bbb-be39-276aa9f17635)

WSDL Obtenu  

![tp6](https://github.com/ghitaahmadi/SOAPWebService/assets/97565150/56bf726a-1fa0-4527-8a1e-9135b69e6cdf)

Lorsqu'on utilise un service web, on commence par générer un proxy côté client à partir du WSDL. Chaque fois que l'on souhaite invoquer une méthode, on fait appel au stub. Le stub est responsable d'envoyer la requête au serveur distant en utilisant le squelette (skeleton).

Création du client JAVA

![tp8](https://github.com/ghitaahmadi/SOAPWebService/assets/97565150/e7b6f4e3-1edb-44d9-bbb2-ddb789f89ef3)

Génération du proxy à partir du WSDL

![tp9](https://github.com/ghitaahmadi/SOAPWebService/assets/97565150/b6aa706a-fa1c-4a4e-9342-cd993dfe0579)


