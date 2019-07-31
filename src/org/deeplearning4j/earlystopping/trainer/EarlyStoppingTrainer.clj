(ns org.deeplearning4j.earlystopping.trainer.EarlyStoppingTrainer
  "Class for conducting early stopping training locally (single machine), for training a
 MultiLayerNetwork. To train a ComputationGraph, use EarlyStoppingGraphTrainer"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.earlystopping.trainer EarlyStoppingTrainer]))

(defn ->early-stopping-trainer
  "Constructor.

  es-config - `org.deeplearning4j.earlystopping.EarlyStoppingConfiguration`
  net - `org.deeplearning4j.nn.multilayer.MultiLayerNetwork`
  train - `org.nd4j.linalg.dataset.api.iterator.DataSetIterator`
  listener - `org.deeplearning4j.earlystopping.listener.EarlyStoppingListener`"
  (^EarlyStoppingTrainer [^org.deeplearning4j.earlystopping.EarlyStoppingConfiguration es-config ^org.deeplearning4j.nn.multilayer.MultiLayerNetwork net ^org.nd4j.linalg.dataset.api.iterator.DataSetIterator train ^org.deeplearning4j.earlystopping.listener.EarlyStoppingListener listener]
    (new EarlyStoppingTrainer es-config net train listener))
  (^EarlyStoppingTrainer [^org.deeplearning4j.earlystopping.EarlyStoppingConfiguration early-stopping-configuration ^org.deeplearning4j.nn.conf.MultiLayerConfiguration configuration ^org.nd4j.linalg.dataset.api.iterator.DataSetIterator train]
    (new EarlyStoppingTrainer early-stopping-configuration configuration train)))

