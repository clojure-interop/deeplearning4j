(ns org.deeplearning4j.earlystopping.saver.LocalFileModelSaver
  "Save the best (and latest/most recent) models learned during early stopping training to the local file system.
 Instances of this class will save 3 files for best (and optionally, latest) models:
 (a) The network configuration: bestModelConf.json
 (b) The network parameters: bestModelParams.bin
 (c) The network updater: bestModelUpdater.bin

 NOTE: The model updater is an object that contains the internal state for training features such as AdaGrad, Momentum
 and RMSProp.
 The updater is not required to use the network at test time; it is saved in case further training is required.
 Without saving the updater, any further training would result in the updater being recreated, without the benefit
 of the history/internal state. This could negatively impact training performance after loading the network."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.earlystopping.saver LocalFileModelSaver]))

(defn ->local-file-model-saver
  "Constructor.

  Constructor that uses default character set for configuration (json) encoding

  directory - Directory to save networks - `java.lang.String`"
  (^LocalFileModelSaver [^java.lang.String directory]
    (new LocalFileModelSaver directory))
  (^LocalFileModelSaver [^java.lang.String directory ^java.nio.charset.Charset encoding]
    (new LocalFileModelSaver directory encoding)))

(defn save-best-model
  "Description copied from interface: EarlyStoppingModelSaver

  net - `org.deeplearning4j.nn.multilayer.MultiLayerNetwork`
  score - `double`

  throws: java.io.IOException"
  ([^LocalFileModelSaver this ^org.deeplearning4j.nn.multilayer.MultiLayerNetwork net ^Double score]
    (-> this (.saveBestModel net score))))

(defn save-latest-model
  "Description copied from interface: EarlyStoppingModelSaver

  net - `org.deeplearning4j.nn.multilayer.MultiLayerNetwork`
  score - `double`

  throws: java.io.IOException"
  ([^LocalFileModelSaver this ^org.deeplearning4j.nn.multilayer.MultiLayerNetwork net ^Double score]
    (-> this (.saveLatestModel net score))))

(defn get-best-model
  "Description copied from interface: EarlyStoppingModelSaver

  returns: `org.deeplearning4j.nn.multilayer.MultiLayerNetwork`

  throws: java.io.IOException"
  (^org.deeplearning4j.nn.multilayer.MultiLayerNetwork [^LocalFileModelSaver this]
    (-> this (.getBestModel))))

(defn get-latest-model
  "Description copied from interface: EarlyStoppingModelSaver

  returns: `org.deeplearning4j.nn.multilayer.MultiLayerNetwork`

  throws: java.io.IOException"
  (^org.deeplearning4j.nn.multilayer.MultiLayerNetwork [^LocalFileModelSaver this]
    (-> this (.getLatestModel))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^LocalFileModelSaver this]
    (-> this (.toString))))

