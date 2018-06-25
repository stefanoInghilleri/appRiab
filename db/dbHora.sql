-- --------------------------------------------------------
-- Host:                         localhost
-- Versione server:              10.1.22-MariaDB - mariadb.org binary distribution
-- S.O. server:                  Win64
-- HeidiSQL Versione:            9.4.0.5125
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


-- Dump della struttura del database appRiabilitazione
CREATE DATABASE IF NOT EXISTS `appriabilitazione` /*!40100 DEFAULT CHARACTER SET latin1 COLLATE latin1_general_ci */;
USE `appRiabilitazione`;

-- Dump della struttura di tabella appRiabilitazione.descrizione_es
CREATE TABLE IF NOT EXISTS `descrizione_es` (
  `ID` int(11) DEFAULT NULL,
  `Tipologia` varchar(50) CHARACTER SET utf8 DEFAULT NULL,
  `Descrizione` varchar(392) CHARACTER SET utf8 DEFAULT NULL,
  `videourl` varchar(200) COLLATE latin1_general_ci DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_general_ci;

-- Dump dei dati della tabella appRiabilitazione.descrizione_es: ~31 rows (circa)
/*!40000 ALTER TABLE `descrizione_es` DISABLE KEYS */;
INSERT INTO `descrizione_es` (`ID`, `Tipologia`, `Descrizione`, `videourl`) VALUES
	(1, 'Attivazione pompa venosa', 'Sdraiati, effettua movimenti di flesso-estensione della caviglia, oppure siediti e appoggia i piedi prima le punte e poi i talloni.', 'file:///C:/Users/unieuropc/Desktop/riabVideo/1.mp4'),
	(2, 'Sollevamento dalla sedia con braccioli', 'Siediti su una sedia con braccioli. Appoggia le mani e i gomiti sui braccioli. Facendo forza sulle mani estendi i gomiti per sollevare il corpo, puoi, anche aiutarti con le gambe. Tieni la posizione per 5/10 secondi.', 'file:///C:/Users/unieuropc/Desktop/riabVideo/2.mp4'),
	(3, 'Contrazione dei quadricipiti', 'Sdraiati sul letto in posizione supina (pancia in su), mantieni i piedi e le caviglie a 90°, cioè in posizione "a martello". Contrai i quadricipiti spingendo con il ginocchio contro il letto. Tieni la posizione per 5/10 secondi.', 'file:///C:/Users/unieuropc/Desktop/riabVideo/3.mp4'),
	(4, 'Contrazione dei quadtricipiti contro resistenza', 'Sdraiati sul letto in posizione supina (pancia in su), mantieni i piedi e le caviglie a 90°, cioè in posizione "a martello". Posiziona un asciugamano arrotolato sotto al ginocchio, contrai i quadricipiti spingendo con il ginocchio contro il letto e solleva la gamba fino ad estendere il ginocchio. Tieni la posizione per 5/10 secondi.', 'file:///C:/Users/unieuropc/Desktop/riabVideo/4.mp4'),
	(5, 'Estensione del ginocchio', 'Sdraiati sul letto in posizione supina (pancia in su), posiziona un asciugamano arrotolato sotto al tallone. Contrai i muscoli della coscia spingendo il ginocchio contro il letto fino ad estendere totalmente il ginocchio. Tieni la posizione per 5/10 secondi. ', 'file:///C:/Users/unieuropc/Desktop/riabVideo/5.mp4'),
	(6, 'Flessione del ginocchio', 'Sdraiati sul letto in posizione semi-seduta, fletti il ginocchio. Traziona con le mani o utilizza un asciugamano, posto sotto la coscia, per flettere il ginocchio. Tieni la posizione per 5/10 secondi.', 'file:///C:/Users/unieuropc/Desktop/riabVideo/6.mp4'),
	(7, 'Flessione del ginocchio da seduti', 'Siediti poggiando i piedi a terra. Porta i talloni verso la sedia in modo tale da flettere il ginocchio. Tieni la posizione per 5/10 secondi.', 'file:///C:/Users/unieuropc/Desktop/riabVideo/7.mp4'),
	(8, 'Estensione del ginocchio/stretching', 'Siediti sul bordo di una sedia ed estendi la gamba, poggiando il piede a martello su uno sgabello, fletti il busto in avanti. Tieni la posizione per 5/10 secondi', 'file:///C:/Users/unieuropc/Desktop/riabVideo/8.mp4'),
	(9, 'Estensioni dell\'arto inferiore', 'Distenditi sul lettino e fletti il ginocchio sano. Solleva l\'arto operato mantenendo il ginocchio esteso.', 'file:///C:/Users/unieuropc/Desktop/riabVideo/9.mp4'),
	(10, 'Esercizi di stabilità della pelvi (core stability)', 'Questo esercizio può aiutare a ridurre i dolori lombari dopo l\'intervento. Sdraiati su un letto oppure siediti su una sedia con la schiena poggiata allo schienale. Piega le ginocchia e tieni i piedi poggiati a terra. Contrai i muscoli dell\'addome "petto in fuori e pancia in dentro" e contemporaneamente contrai anche i muscoli che permettono la minzione. Tieni la posizione per 5/10 secondi.', 'file:///C:/Users/unieuropc/Desktop/riabVideo/10.mp4'),
	(11, 'Flessione passiva del ginocchio', 'Siediti su una sedia con braccioli poggiando i piedi a terra. Tieni i piedi fermi e scivola con il sedere in avanti per flettere il ginocchio. Tieni la posizione per 5/10 secondi.', 'file:///C:/Users/unieuropc/Desktop/riabVideo/11.mp4'),
	(12, 'Flessione assistita del ginocchio', 'Siediti su una sedia e porta la gamba non operata davanti a quella operata. Spingi con la gamba non operata in modo da flettere la gamba operata (cerca di incrementare la flessione). Tieni la posizione per 5/10 secondi.', 'file:///C:/Users/unieuropc/Desktop/riabVideo/12.mp4'),
	(13, 'Flessione attiva del ginocchio', 'Sdraiati sul letto in posizione prona (pancia in giù). Fletti il ginocchio  e porta i talloni verso i glutei. Si può utilizzare l\'arto non operato per flettere quello operato. Tenere la posizione per 5/10 secondi.', 'file:///C:/Users/unieuropc/Desktop/riabVideo/13.mp4'),
	(14, 'Flessione del ginocchio da stazione eretta', 'Appoggiati su un supporto stabile. Scarica il peso del corpo sulla gamba non operata. Fletti il ginocchio, della gamba operata, portando il tallone verso il gluteo. Tenere la posizione per 5/10 secondi.', 'file:///C:/Users/unieuropc/Desktop/riabVideo/14.mp4'),
	(15, 'Flessioni del ginocchio su scale', 'Posiziona la gamba operata sul primo scalino e poi appoggiati al corrimano. Fletti il ginocchio in avanti. Tieni la posizione per 5/10 secondi.', 'file:///C:/Users/unieuropc/Desktop/riabVideo/15.mp4'),
	(16, 'Stretching', 'Poggia le mani al muro tenendo la gamba non operata davanti all\'altra. Tieni la gamba posteriore (operata) estesa con il tallone poggiato a terra. Tenere la posizione per 5/10 secondi.', 'file:///C:/Users/unieuropc/Desktop/riabVideo/16.mp4'),
	(17, 'Stretching passivo del ginocchio', 'Sdraiati su un letto, in posizione prona (pacia in giù) e, sistema il ginocchio e la gamba fuori dal letto. Lascia che la gravità estenda il ginocchio. Tieni la posizione per 5/10 secondi.', 'file:///C:/Users/unieuropc/Desktop/riabVideo/17.mp4'),
	(18, 'Estensioni attive', 'Sdraiati sul letto, in posizione prona (pancia in giù) e, metti un asciugamano sotto la caviglia. Estendi il ginocchio. Tieni la posizione per 5/10 secondi.', 'file:///C:/Users/unieuropc/Desktop/riabVideo/18.mp4'),
	(19, 'Estensione del ginocchio da seduto', 'Siediti su una sedia stabile e poggia la parte posteriore della coscia sulla sedia. In seguito, estendi il ginocchio. Quando l\'esercizio verrà eseguito senza fatica applica dei pesi alle cavigle.', 'file:///C:/Users/unieuropc/Desktop/riabVideo/19.mp4'),
	(20, 'Trasferimento laterale del peso', 'Mettiti in posizione eretta davanti ad un tavolo e divarica le gambe. Passa con il peso da una gamba all\'altra. Per rendere l\'esercizio più complesso si può flettere il ginocchio fuori carico. Tenere la posizione per 5/10 secondi.', 'file:///C:/Users/unieuropc/Desktop/riabVideo/20.mp4'),
	(21, 'Trasferimento del peso in avanti ed indietro', 'Mettiti in posizione eretta davanti ad un tavolo. Posiziona un piedi davanti all\'altro con le gambe divaricate. Passa con il peso da una gamba all\'altra. Cambia la posizione dei piedi e ripeti. Tenere la posizione per 5/10 secondi.', 'file:///C:/Users/unieuropc/Desktop/riabVideo/21.mp4'),
	(22, 'Mini squat', 'Per questo esercizio serve un tavolo come supporto. Mettiti in posizione eretta con i piedi ben poggiati a terra. Fletti le anche e le ginocchia tenendo i talloni poggiati a terra. Torna alla posizione di partenza. (E\' importante che la punta del ginocchio non superi la punta del piede) Tieni la posizione per 5/10 secondi.', 'file:///C:/Users/unieuropc/Desktop/riabVideo/22.mp4'),
	(23, 'Sollevamento tacco-punta', 'Per questo esercizio serve un tavolo come supporto. Sollevati sulle punte. Tieni la posizione per 5/10 secondi. Sollevati sui talloni. Tieni la posizione per 5/10 secondi.', 'file:///C:/Users/unieuropc/Desktop/riabVideo/23.mp4'),
	(24, 'Equilibrio su una gamba', 'Mettiti in posizione eretta davanti ad un tavolo per sicurezza. Metti il peso sulla gamba operata e solleva la non operata. Mantieni la pelvi e la colonna dritti. Tieni la posizione per 5/10 secondi.', 'file:///C:/Users/unieuropc/Desktop/riabVideo/24.mp4'),
	(25, 'Estensioni del ginocchio contro resistenza', 'Attacca un elastico ad una struttura stabile ed alla caviglia operata. Siediti su una sedia e poggia la gamba operata su un asciugamano. Fai scivolare il piede in avanti per estendere il ginocchio. Tieni la posizione per 5/10 secondi.', 'file:///C:/Users/unieuropc/Desktop/riabVideo/25.mp4'),
	(26, 'Flessioni del ginocchio contro resistenza', 'Attacca un elastico ad una struttura stabile ed alla caviglia operata. Siediti su una sedia e poggia la gamba operata su un asciugamano. Fai scivolare il piede indietro per flettere il ginocchio. Tieni la posizione per 5/10 secondi.', 'file:///C:/Users/unieuropc/Desktop/riabVideo/26.mp4'),
	(27, 'Passaggi posturali (seduti-in piedi)', 'Siediti sul bordo di una sedia e successivamente piega il busto in avanti sino a guardare i piedi. Alzati in piedi senza utilizzare le mani. Siediti nuovamente. Tenere la posizione per 5/10 secondi.', 'file:///C:/Users/unieuropc/Desktop/riabVideo/27.mp4'),
	(28, 'Scivolamenti sul muro', 'Mettiti in posizione eretta con la schiena appoggiata al muro. Posiziona i piedi a 20 cm dal muro. Fletti le ginocchia e fai scivolare lentamente  il tronco sul muro, tenendo le ginocchia allineate ai piedi. Fermati quando senti i muscoli della coscia sotto sforzo. Torna alla posizione di partenza. Tieni la posizione per 5/10 secondi.', 'file:///C:/Users/unieuropc/Desktop/riabVideo/28.mp4'),
	(29, 'Step', 'Posizionati in piedi davanti a un gradino. Poggiati al corrimano e sali lo scalino con la gamba operata. Torna alla posizione di partenza con la gamba non operata. Durante l\'esercizio si richiede di mantenere la pelvi e la colonna verticale dritta. Tenere la posizione per 5/10 secondi.', 'file:///C:/Users/unieuropc/Desktop/riabVideo/29.mp4'),
	(30, 'Step laterale', 'Posizionati in piedi di fianco a un gradino e poggiati al corrimano. Sali lo scalino lateralmente con la gamba operata. Torna alla posizione di partenza con la gamba non operata. Durante l\'esercizio si richiede di mantenere la pelvi e la colonna vertebrale dritta. Tieni la posizione pr 5/10 secondi.', 'file:///C:/Users/unieuropc/Desktop/riabVideo/30.mp4'),
	(31, 'Affondi', 'Appoggiati su un supporto stabile (tavolino, sbarra...). Fai un passo in avanti con la gamba operata tenendo il busto eretto. Fletti lentamente il ginocchio mantenendolo tra il tallone e le dita del piede (la punta del ginocchio non deve superare la punta dei piedi). Torna alla posizione di partenza. Tieni la posizione per 5/10 secondi.', 'file:///C:/Users/unieuropc/Desktop/riabVideo/31.mp4');
/*!40000 ALTER TABLE `descrizione_es` ENABLE KEYS */;

-- Dump della struttura di tabella appRiabilitazione.es_2_mesi
CREATE TABLE IF NOT EXISTS `es_2_mesi` (
  `GIORNO` int(11) DEFAULT NULL,
  `Es_mattino` varchar(15) CHARACTER SET utf8 DEFAULT NULL,
  `Es_pomeriggio` varchar(15) CHARACTER SET utf8 DEFAULT NULL,
  `Ripetizioni` varchar(13) CHARACTER SET utf8 DEFAULT NULL,
  `Note` varchar(70) CHARACTER SET utf8 DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_general_ci;

-- Dump dei dati della tabella appRiabilitazione.es_2_mesi: ~56 rows (circa)
/*!40000 ALTER TABLE `es_2_mesi` DISABLE KEYS */;
INSERT INTO `es_2_mesi` (`GIORNO`, `Es_mattino`, `Es_pomeriggio`, `Ripetizioni`, `Note`) VALUES
	(1, '1; 2; 12;', '11; 8; 10; 1;', '3 serie da 10', 'Es 1 ogni serie deve avere 40 ripetizioni'),
	(2, '1; 3; 4; ', '5; 6; 10; 1;', '3 serie da 10', 'Es 1 ogni serie deve avere 40 ripetizioni'),
	(3, '1; 7; 8; ', '12; 2; 10; 1;', '3 serie da 10', 'Es 1 ogni serie deve avere 40 ripetizioni'),
	(4, '1; 3; 4; ', '9; 6; 10; 1;', '3 serie da 15', 'Es 1 ogni serie deve avere 40 ripetizioni'),
	(5, '1; 11; 8; ', '12; 9; 2; 1;', '3 serie da 15', 'Es 1 ogni serie deve avere 40 ripetizioni'),
	(6, '1; 3; 4; ', '9; 6; 10; 1;', '3 serie da 15', 'Es 1 ogni serie deve avere 40 ripetizioni'),
	(7, '1; 5; 6; ', '10; 2; 12; 1;', '3 serie da 15', 'Es 1 ogni serie deve avere 40 ripetizioni'),
	(8, '1; 2; 12;', '11; 8; 10; 1;', '3 serie da 20', 'Es 1 ogni serie deve avere 40 ripetizioni'),
	(9, '1; 3; 4; ', '5; 6; 10; 1;', '3 serie da 20', 'Es 3 e 4 solo 15 ripetizioni-Es 1 ogni serie deve avere 40 ripetizioni'),
	(10, '1; 7; 8; ', '12; 2; 10; 1;', '3 serie da 20', 'Es 1 ogni serie deve avere 40 ripetizioni'),
	(11, '1; 3; 4; ', '9; 6; 10; 1;', '3 serie da 25', 'Es 3 e 4 solo 15 ripetizioni-Es 1 ogni serie deve avere 40 ripetizioni'),
	(12, '1; 11; 8; ', '12; 9; 2; 1;', '3 serie da 25', 'Es 1 ogni serie deve avere 40 ripetizioni'),
	(13, '1; 3; 4; ', '9; 6; 10; 1;', '3 serie da 25', 'Es 3 e 4 solo 15 ripetizioni-Es 1 ogni serie deve avere 40 ripetizioni'),
	(14, '1; 5; 6; ', '10; 2; 11; 1;', '3 serie da 25', 'Es 1 ogni serie deve avere 40 ripetizioni'),
	(15, '13; 17; 12;', '15; 20; 21;', '3 serie da 20', NULL),
	(16, '25; 26; 13; 18;', '23; 24; 14; 16;', '3 serie da 15', NULL),
	(17, '23; 24; 16;', '14; 19; 21;', '3 serie da 20', NULL),
	(18, '28; 29; 19; 22;', '13; 18; 20; 24;', '3 serie da 15', NULL),
	(19, '15; 16; 23;', '22; 24; 17;', '3 serie da 20', NULL),
	(20, '30; 31; 17; 18;', '20; 21; 14, 19;', '3 serie da 15', NULL),
	(21, '13; 17; 23;', '22; 24; 16;', '3 serie da 20', NULL),
	(22, '25; 26; 27; 19;', '15; 16; 20; 23;', '3 serie da 25', 'Es 25, 26 e 27 solo 15 ripetizioni'),
	(23, '22; 24; 16;', '13; 18; 15;', '3 serie da 20', NULL),
	(24, '28; 29; 30; 16;', '13; 17; 18; 19;', '3 serie da 25', 'Es 28, 29 e 30 solo 15 ripetizioni'),
	(25, '20; 21; 17;', '22; 14; 19; ', '3 serie da 20', NULL),
	(26, '31; 25; 26; 24;', '13; 17; 14; 19;', '3 serie da 25', 'Es 25, 26 e 31 solo 15 ripetizioni'),
	(27, '23; 24; 15;', '20; 21; 22;', '3 serie da 20', NULL),
	(28, '27; 29; 30; 17;', '20; 21; 24; 18;', '3 serie da 25', 'Es 27, 29 e 30 solo 15 ripetizioni'),
	(29, '13; 17; 12;', '15; 20; 21;', '4 serie da 20', NULL),
	(30, '25; 26; 13; 18;', '23; 24; 14; 16;', '4 serie da 15', NULL),
	(31, '23; 24; 16;', '14; 19; 21;', '4 serie da 20', NULL),
	(32, '28; 29; 19; 21;', '13; 18; 20; 24;', '4 serie da 15', NULL),
	(33, '15; 16; 23;', '22; 24; 17;', '4 serie da 20', NULL),
	(34, '30; 31; 17; 18;', '20; 21; 14, 19;', '4 serie da 15', NULL),
	(35, '13; 17; 23;', '22; 24; 16;', '4 serie da 20', NULL),
	(36, '25; 26; 27; 19;', '15; 16; 20; 23;', '3 serie da 25', 'Es 25,26 e 27 solo 15 ripetizioni'),
	(37, '22; 24; 16;', '13; 18; 15;', '3 serie da 20', NULL),
	(38, '28; 29; 30; 16;', '13; 17; 18; 19;', '3 serie da 25', 'Es 28, 29 e 30 solo 15 ripetizioni'),
	(39, '20; 21; 17;', '22; 14; 19; ', '3 serie da 20', NULL),
	(40, '31; 25; 26; 24;', '13; 17; 16; 19;', '3 serie da 25', 'Es 25,26 e 27 solo 15 ripetizioni'),
	(41, '23; 24; 15;', '20; 21; 22;', '3 serie da 20', NULL),
	(42, '27; 29; 30; 17;', '20; 21; 24; 18;', '3 serie da 25', 'Es 27, 29 e 30 solo 15 ripetizioni'),
	(43, '13; 17; 12;', '15; 20; 21;', '4 serie da 20', NULL),
	(44, '25; 26; 13; 18;', '23; 24; 14; 16;', '4 serie da 15', NULL),
	(45, '23; 24; 16;', '14; 19; 21;', '4 serie da 20', NULL),
	(46, '28; 29; 19; 21;', '13; 18; 20; 24;', '4 serie da 15', NULL),
	(47, '15; 16; 23;', '22; 24; 17;', '4 serie da 20', NULL),
	(48, '30; 31; 17; 18;', '20; 21; 14, 19;', '4 serie da 15', NULL),
	(49, '13; 17; 23;', '22; 24; 16;', '4 serie da 20', NULL),
	(50, '25; 26; 27; 19;', '15; 16; 20; 23;', '3 serie da 25', 'Es 25,26 e 27 solo 15 ripetizioni'),
	(51, '22; 24; 16;', '13; 18; 15;', '3 serie da 20', NULL),
	(52, '28; 29; 30; 16;', '13; 17; 18; 19;', '5 serie da 15', NULL),
	(53, '20; 21; 17;', '22; 14; 19; ', '3 serie da 20', NULL),
	(54, '31; 25; 26; 24;', '13; 17; 14; 19;', '5 serie da 15', NULL),
	(55, '23; 24; 15;', '20; 21; 22;', '3 serie da 20', NULL),
	(56, '27; 29; 30; 17;', '20; 21; 24; 18;', '5 serie da 15', NULL);
/*!40000 ALTER TABLE `es_2_mesi` ENABLE KEYS */;

-- Dump della struttura di tabella appRiabilitazione.pazienti
CREATE TABLE IF NOT EXISTS `pazienti` (
  `Id_Paziente` int(11) DEFAULT NULL,
  `nome` varchar(16) CHARACTER SET utf8 DEFAULT NULL,
  `cognome` varchar(16) CHARACTER SET utf8 DEFAULT NULL,
  `eta` date DEFAULT NULL,
  `sesso` varchar(10) CHARACTER SET utf8 DEFAULT NULL,
  `tipo_intervento` varchar(9) CHARACTER SET utf8 DEFAULT NULL,
  `arto_interessato` varchar(10) CHARACTER SET utf8 DEFAULT NULL,
  `punteggio_Womac_1` int(1) unsigned zerofill DEFAULT '0',
  `punteggio_Womac_2` int(2) unsigned zerofill DEFAULT '00',
  `punteggio_Womac_3` int(2) unsigned zerofill DEFAULT '00',
  `punteggio_Womac_4` int(2) unsigned zerofill DEFAULT '00',
  `numeroSedute` int(1) unsigned DEFAULT NULL,
  `Seduta1` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_general_ci;

-- Dump dei dati della tabella appRiabilitazione.pazienti: ~1 rows (circa)
/*!40000 ALTER TABLE `pazienti` DISABLE KEYS */;
INSERT INTO `pazienti` (`Id_Paziente`, `nome`, `cognome`, `eta`, `sesso`, `tipo_intervento`, `arto_interessato`, `punteggio_Womac_1`, `punteggio_Womac_2`, `punteggio_Womac_3`, `punteggio_Womac_4`, `numeroSedute`, `Seduta1`) VALUES
	(1, 'Mario', 'Rossi', '1972-10-03', 'Maschio', 'Ginocchio', 'Destro', 0, 00, 00, 00, 1, '2018-06-24');
/*!40000 ALTER TABLE `pazienti` ENABLE KEYS */;

-- Dump della struttura di tabella appRiabilitazione.punteggio
CREATE TABLE IF NOT EXISTS `punteggio` (
  `Id` int(11) DEFAULT NULL,
  `Punteggio` varchar(5) CHARACTER SET utf8 DEFAULT NULL,
  `Risultato` varchar(187) CHARACTER SET utf8 DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_general_ci;

-- Dump dei dati della tabella appRiabilitazione.punteggio: ~4 rows (circa)
/*!40000 ALTER TABLE `punteggio` DISABLE KEYS */;
INSERT INTO `punteggio` (`Id`, `Punteggio`, `Risultato`) VALUES
	(1, '0-24', '\r\nSi trova all\'inizio di un percorso riabilitativo per cui è normale avere un punteggio basso. Niente panico!  Vedrà che con un po’ di impegno e buona volontà i risultati miglioreranno.'),
	(2, '25-49', 'Ha appena iniziato un percorso riabilitativo per cui è normale questo punteggio.  Vedrà che proseguendo con gli esercizi i risultati miglioreranno.'),
	(3, '50-74', 'Ha ottenuto un punteggio medio-alto il che vuol dire che è ad un buon punto della riabilitazione. Continui così, ci siamo quasi!'),
	(4, '75-96', 'Complimenti ha ottenuto un punteggio eccellente e correttamente concluso il suo percorso riabilitativo. Mi raccomando, tenga a mente tutti i consigli e continui a mantenersi in movimento!');
/*!40000 ALTER TABLE `punteggio` ENABLE KEYS */;

-- Dump della struttura di tabella appRiabilitazione.warning
CREATE TABLE IF NOT EXISTS `warning` (
  `ID` int(11) DEFAULT NULL,
  `CATEGORIA` varchar(60) COLLATE latin1_general_ci DEFAULT NULL,
  `TIPOLOGIA` varchar(49) CHARACTER SET utf8 DEFAULT NULL,
  `CONSIGLI_E_PRECAUZIONI` varchar(1041) CHARACTER SET utf8 DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_general_ci;

-- Dump dei dati della tabella appRiabilitazione.warning: ~20 rows (circa)
/*!40000 ALTER TABLE `warning` DISABLE KEYS */;
INSERT INTO `warning` (`ID`, `CATEGORIA`, `TIPOLOGIA`, `CONSIGLI_E_PRECAUZIONI`) VALUES
	(1, 'Generale', 'Generale ', 'Continuare a camminare con le stampelle ed eseguire gli esercizi appresi.'),
	(2, 'Generale', 'Igiene personale', 'Utilizzare un rialzo per il water, anche per l\'igiene personale quotidiana; evitare la vasca da bagno a meno che non si sia provvisti di ausilii idonei, in caso contrario è preferibile usare la doccia attrezzata con maniglioni per non scivolare. '),
	(3, 'Sdraiato', 'Posizione a letto', 'A letto non dormire sul lato operato. Quando si dorme su un fianco porre un cuscino tra le gambe, che rimangono leggermente flesse. Durante il sonno è necessario tenere il ginocchio esteso, per cui non bisogna posizionare cuscini o asciugamani sotto al ginocchio. '),
	(4, 'Sdraiato', 'Salire sul letto', 'Salire sul letto: 1)sedersi sul bordo del letto con i piedi per terra, far scivolare le anche indietro sostenendo il peso con le braccia 2) far scivolare le gambe sul letto; tenere la gamba operata dritta 3) una volta a letto, tenere le dita dei piedi rivolte verso l\'alto.'),
	(5, 'Sdraiato', 'Scendere dal letto', 'Alzarsi dal letto: far scivolare le gambe verso il bordo del letto; tenere la gamba operata dritta 2) far scivolare le gambe in modo che i talloni siano oltre il bordo del letto 3) scivolare con il bacino in avanti fino a quando entrambi i piedi sono a terra aiutandosi con le braccia a sostenere il peso corporeo.'),
	(6, 'Seduto', 'Seduti su una sedia', 'Sedersi su una sedia (evitare materassi e/o sedie troppo basse, il ginocchio non deve mai trovarsi più in alto rispetto all\'anca): 1) stare davanti alla sedia Indietreggiare fino a toccare il bordo della sedia con le gambe 2) posizionare la gamba operata lontano di fronte a voi 3) tenere le stampelle con la mano opposta rispetto all\'arto operato; con l\'altra mano appoggiarsi al bracciolo della sedia scaricando il peso sull\'arto sano 4) iniziare la seduta 5) una volta che vi siede seduti, si può flettere il ginocchio dell\'arto operato  6) quando si è seduti, tenere sempre le ginocchia in un piano inferiore rispetto ai fianchi 7) evitare di stare seduti per lunghi periodi di tempo. alzarsi ogni 20-30 minuti per fare una passeggiata prima di sedersi di nuovo'),
	(7, 'Seduto', 'Scendere dalla sedia', 'Alzarsi da una sedia: posizionare il piede della gamba operata lontano di fronte a voi 2) scivolare con cautela verso il bordo della sedia 3) anche in questo caso, posizionare la gamba operata lontano di fronte a voi 4) facendo forza con entrambe le mani sui braccioli della sedia spingeresi in alto, aiutatevi facendo forza con la gamba non operata 5) non cercare di usare la gamba operata per alzarsi dalla sedia 6) tenere le stampelle con la mano che si trova sul lato sano 7) una volta in piedi, mettere una stampella sotto ogni braccio 8) EVITARE DI FLETTERE IL BUSTO IN AVANTI PER ALZARSI'),
	(8, 'In piedi', 'Salire le scale', 'Salire le scale: 1) mettere una mano sulla ringhiera e tenere le stampelle con l\'altra mano 2) sostenere il peso con le braccia spostare il peso sull\'arto non operato 3) salire con l\'arto operato e le stampelle affiancando l\'arto non operato  4) ripetere la procedura'),
	(9, 'In piedi', 'Salire le scale', 'Scendere le scale: 1) tenere le stampelle con una mano e posizionare l\'altra mano sulla ringhiera 2) iniziare la discesa per le scale con le stampelle quindi scendere con l\'arto operato poi con la gamba sana.'),
	(10, 'Generale', 'Entrare in macchina', 'Entrare in macchina: spostare il sedile posteriore il più possibile e reclinanrlo leggermente vi aiuterà a mantenere la vostra anca operata retta quando salirete in macchina. 1) posizionarsi di spalle rispetto al lato di entrata 2) portare in avanti l\'arto operato e sedersi sul bordo esterno del sedile 3) portare il bacino verso il centro del sedile e ruotarlo 4) portare prima la gamba sinistra poi la destra all\'interno dell\'abitacolo 5) accomodarsi poggiando la schiena allo schienale reclinato e allungare le gambe. Suggerimento: l\'aggiunta di un cuscino fermo sul sedile aiuterà anche a mantenere l\'anca operata in posizione funzionale e vi aiuterà ad entrare e uscire dalla macchina più facilmente. si può anche mettere un sacchetto di plastica sul sedile per aiutarvi a scivolare il più facilmente. In automobile sedersi sui sedili posteriori di una vettura a quattro porte con un cuscino sotto il sedere, oppure a fianco dell\'autista con lo schienale reclinato evitando una eccessiva flessione dell\'anca in caso di frenata brusca. '),
	(11, 'Generale', 'Salire in macchina', 'Uscire dalla macchina: 1) portare all\'esterno la gamba destra 2) ruotare il bacino e trasferire l\'arto sinistro verso l\'esterno 3) portare il bacino verso il bordo esterno del sedile e allungare in avanti la gamba operata, flettere l\'arto sano, afferare le stampelle e alzarsi in piedi.'),
	(12, 'Generale', 'Camminare', 'Rieducazione del passo: inizialmente si utilizzerà il deambulatore per camminare ed una volta acquisita autonomia ed equilibrio, potete passsare alle stampelle (questa fase potrebbe non essere necessaria utilizzando quindi da subito le stampelle).'),
	(13, 'Generale', 'Raccogliere oggetti', 'Raccogliere gli oggetti che cadono al suolo senza flettere il busto in avanti, ma esclusivamente con l\'ausilio di una pinza a manico lungo; usare un calzascarpe adattato evitando calzature con lacci; per indossare le claze aiutarsi con il così detto “ infilacalze” '),
	(14, 'Generale', 'Lavori domesstici ', 'Evitare le faccende domestiche e/o lavori pesanti fino al primo controllo medico-ambulatoriale.'),
	(15, 'Generale', 'In cucina', 'È possibile cucinare ricordando di usare sempre le stampelle per ogni spostamento anche piccolo e facendo attenzione, nei momenti in cui si è fermi, a caricare solo sull\'arto non operato.   '),
	(16, 'Da evitare', 'A letto', 'Evitare di flettere il busto in avanti per rimboccarsi le coperte.'),
	(17, 'Da evitare', 'Movimenti', 'Evitare i movimenti a rischio di lussazione per la protesi quali: eccessiva flessione dell\'anca; adduzione, cioè non accavallare le gambe né da seduti né da in piedi; non ruotare la punta dei piedi e il ginocchio all\'esterno, né da sdraiati né da in piedi;'),
	(18, 'Da evitare', 'Seduto ', 'Non incrociare mai le gambe, né da seduto né da sdraiati nè, soprattutto, mentre si cammina. '),
	(19, 'Da evitare', 'Attività fisica', 'Evitare la cyclette salvo diversa indicazione dell\'ortopedico. '),
	(20, 'Da evitare', 'Attenzione in casa', 'È sconsigliato usare tappeti e cere per lucidare i pavimenti di casa ');
/*!40000 ALTER TABLE `warning` ENABLE KEYS */;

-- Dump della struttura di tabella appRiabilitazione.womac_questionario
CREATE TABLE IF NOT EXISTS `womac_questionario` (
  `idDomanda` int(11) NOT NULL AUTO_INCREMENT,
  `NB` varchar(349) CHARACTER SET utf8 DEFAULT NULL,
  `Domande` varchar(133) CHARACTER SET utf8 DEFAULT NULL,
  `Nessuno` int(11) DEFAULT NULL,
  `Leggero` int(11) DEFAULT NULL,
  `Moderato` int(11) DEFAULT NULL,
  `Forte` int(11) DEFAULT NULL,
  `Estrema` int(11) DEFAULT NULL,
  PRIMARY KEY (`idDomanda`)
) ENGINE=InnoDB AUTO_INCREMENT=25 DEFAULT CHARSET=latin1 COLLATE=latin1_general_ci;

-- Dump dei dati della tabella appRiabilitazione.womac_questionario: ~24 rows (circa)
/*!40000 ALTER TABLE `womac_questionario` DISABLE KEYS */;
INSERT INTO `womac_questionario` (`idDomanda`, `NB`, `Domande`, `Nessuno`, `Leggero`, `Moderato`, `Forte`, `Estrema`) VALUES
	(1, '1/24 Pensi al dolore imputabile all’artrosi accusato in corrispondenza del Suo ginocchio durante le ultime 48 ore. ', 'Che intensità di dolore prova camminando su una superficie piana?', NULL, NULL, 0, NULL, NULL),
	(2, '2/24 Pensi al dolore imputabile all’artrosi accusato in corrispondenza del Suo ginocchio durante le ultime 48 ore.', 'Che intensità di dolore prova salendo o scendendo le scale?', NULL, NULL, 0, NULL, NULL),
	(3, '3/24 Pensi al dolore imputabile all’artrosi accusato in corrispondenza del Suo ginocchio durante le ultime 48 ore. ', 'Che intensità di dolore prova a letto, durante il sonno notturno? (interferisce con il sonno)', NULL, NULL, 0, NULL, NULL),
	(4, '4/24 Pensi al dolore imputabile all’artrosi accusato in corrispondenza del Suo ginocchio durante le ultime 48 ore. ', 'Che intensità di dolore prova da seduto o in posizione supina?', NULL, NULL, 0, NULL, NULL),
	(5, '5/24 Pensi al dolore imputabile all’artrosi accusato in corrispondenza del Suo ginocchio durante le ultime 48 ore.', 'Che intensità di dolore prova stando in piedi, in posizione eretta?', NULL, NULL, 0, NULL, NULL),
	(6, '6/24 Pensi alla rigidità (non al dolore) imputabile all’artrosi accusata in corrispondenza del Suo ginocchio durante le ultime 48 ore.', 'Quanto è intensa la Sua rigidità subito dopo il risveglio al mattino?\r\n\r\n', NULL, NULL, 0, NULL, NULL),
	(7, '7/24 Pensi alla rigidità (non al dolore) imputabile all’artrosi accusata in corrispondenza del Suo ginocchio durante le ultime 48 ore.', 'Quanto è intensa la Sua rigidità  dopo essere stato seduto, sdraiato  oppure dopo aver riposato, più  tardi nel corso della giornata?', NULL, NULL, 0, NULL, NULL),
	(8, '8/24 Difficoltà riscontrate nella conduzione di attività fisiche quotidiane imputabili all’artrosi accusata in corrispondenza del Suo ginocchio durante le ultime 48 ore. ', 'Che intensità di dolore prova nel scendere le scale?', NULL, NULL, 0, NULL, NULL),
	(9, '9/24 Difficoltà riscontrate nella conduzione di attività fisiche quotidiane imputabili all’artrosi accusata in corrispondenza del Suo ginocchio durante le ultime 48 ore. ', 'Che intensità di dolore prova nel salire le scale?', NULL, NULL, 0, NULL, NULL),
	(10, '10/24 Difficoltà riscontrate nella conduzione di attività fisiche quotidiane imputabili all’artrosi accusata in corrispondenza del Suo ginocchio durante le ultime 48 ore. \nPer favore, indichi le Sue risposte collocando una X in una delle caselle. ', 'Che intensità di dolore prova nell\'alzarsi da seduto?', NULL, NULL, 0, NULL, NULL),
	(11, '11/24 Difficoltà riscontrate nella conduzione di attività fisiche quotidiane imputabili all’artrosi accusata in corrispondenza del Suo ginocchio durante le ultime 48 ore. ', 'Che intensità di dolore prova nel stare in piedi?', NULL, NULL, 0, NULL, NULL),
	(12, '12/24 Difficoltà riscontrate nella conduzione di attività fisiche quotidiane imputabili all’artrosi accusata in corrispondenza del Suo ginocchio durante le ultime 48 ore. ', 'Che intensità di dolore prova nel piegarsi verso il pavimento (per raccogliere un oggetto)?', NULL, NULL, 0, NULL, NULL),
	(13, '13/24 Difficoltà riscontrate nella conduzione di attività fisiche quotidiane imputabili all’artrosi accusata in corrispondenza del Suo ginocchio durante le ultime 48 ore. ', 'Che intensità di dolore prova nel camminare su una superficie piana?', NULL, NULL, 0, NULL, NULL),
	(14, '14/24 Difficoltà riscontrate nella conduzione di attività fisiche quotidiane imputabili all’artrosi accusata in corrispondenza del Suo ginocchio durante le ultime 48 ore. ', 'Che intensità di dolore prova nell\'entrare ed uscire da una autovettura o salire e scendere da un autobus?', NULL, NULL, 0, NULL, NULL),
	(15, '15/24 Difficoltà riscontrate nella conduzione di attività fisiche quotidiane imputabili all’artrosi accusata in corrispondenza del Suo ginocchio durante le ultime 48 ore. ', 'Che intensità di dolore prova nell\'andare a far spese?', NULL, NULL, 0, NULL, NULL),
	(16, '16/24 Difficoltà riscontrate nella conduzione di attività fisiche quotidiane imputabili all’artrosi accusata in corrispondenza del Suo ginocchio durante le ultime 48 ore. ', 'Che intensità di dolore prova nel mettersi i calzini o le calze?', NULL, NULL, 0, NULL, NULL),
	(17, '17/24 Difficoltà riscontrate nella conduzione di attività fisiche quotidiane imputabili all’artrosi accusata in corrispondenza del Suo ginocchio durante le ultime 48 ore. ', 'Che intensità di dolore prova nell\'alzarsi dal letto?', NULL, NULL, 0, NULL, NULL),
	(18, '18/24 Difficoltà riscontrate nella conduzione di attività fisiche quotidiane imputabili all’artrosi accusata in corrispondenza del Suo ginocchio durante le ultime 48 ore. ', 'Che intensità di dolore prova nel togliersi i calzini o le calze?', NULL, NULL, 0, NULL, NULL),
	(19, '19/24 Difficoltà riscontrate nella conduzione di attività fisiche quotidiane imputabili all’artrosi accusata in corrispondenza del Suo ginocchio durante le ultime 48 ore. ', 'Che intensità di dolore prova nel stare sdraiato a letto?', NULL, NULL, 0, NULL, NULL),
	(20, '20/24 Difficoltà riscontrate nella conduzione di attività fisiche quotidiane imputabili all’artrosi accusata in corrispondenza del Suo ginocchio durante le ultime 48 ore. ', 'Che intensità di dolore prova nell\'entrare ed uscire dalla vasca da bagno', NULL, NULL, 0, NULL, NULL),
	(21, '21/24 Difficoltà riscontrate nella conduzione di attività fisiche quotidiane imputabili all’artrosi accusata in corrispondenza del Suo ginocchio durante le ultime 48 ore. ', 'Che intensità di dolore prova nel stare seduto?', NULL, NULL, 0, NULL, NULL),
	(22, '22/24 Difficoltà riscontrate nella conduzione di attività fisiche quotidiane imputabili all’artrosi accusata in corrispondenza del Suo ginocchio durante le ultime 48 ore. ', 'Che intensità di dolore prova nel sedersi o alzarsi dal water?', NULL, NULL, 0, NULL, NULL),
	(23, '23/24 Difficoltà riscontrate nella conduzione di attività fisiche quotidiane imputabili all’artrosi accusata in corrispondenza del Suo ginocchio durante le ultime 48 ore. ', 'Che intensità di dolore prova nel fare lavori domestici pesanti?', NULL, NULL, 0, NULL, NULL),
	(24, '24/24 Difficoltà riscontrate nella conduzione di attività fisiche quotidiane imputabili all’artrosi accusata in corrispondenza del Suo ginocchio durante le ultime 48 ore. ', 'Che intensità di dolore prova nel fare lavori domestici leggeri?', NULL, NULL, 0, NULL, NULL);
/*!40000 ALTER TABLE `womac_questionario` ENABLE KEYS */;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
