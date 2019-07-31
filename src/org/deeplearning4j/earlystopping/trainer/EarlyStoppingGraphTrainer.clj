(ns org.deeplearning4j.earlystopping.trainer.EarlyStoppingGraphTrainer
  "Class for conducting early stopping training locally (single machine).
 Can be used to train a ComputationGraph"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.earlystopping.trainer EarlyStoppingGraphTrainer]))

(defn ->early-stopping-graph-trainer
  "Constructor.

  Constructor for training using a DataSetIterator

  es-config - Configuration - `org.deeplearning4j.earlystopping.EarlyStoppingConfiguration`
  net - Network to train using early stopping - `org.deeplearning4j.nn.graph.ComputationGraph`
  train - DataSetIterator for training the network - `org.nd4j.linalg.dataset.api.iterator.DataSetIterator`
  listener - Early stopping listener. May be null. - `org.deeplearning4j.earlystopping.listener.EarlyStoppingListener`"
  (^EarlyStoppingGraphTrainer [^org.deeplearning4j.earlystopping.EarlyStoppingConfiguration es-config ^org.deeplearning4j.nn.graph.ComputationGraph net ^org.nd4j.linalg.dataset.api.iterator.DataSetIterator train ^org.deeplearning4j.earlystopping.listener.EarlyStoppingListener listener]
    (new EarlyStoppingGraphTrainer es-config net train listener))
  (^EarlyStoppingGraphTrainer [^org.deeplearning4j.earlystopping.EarlyStoppingConfiguration es-config ^org.deeplearning4j.nn.graph.ComputationGraph net ^org.nd4j.linalg.dataset.api.iterator.DataSetIterator train]
    (new EarlyStoppingGraphTrainer es-config net train)))

