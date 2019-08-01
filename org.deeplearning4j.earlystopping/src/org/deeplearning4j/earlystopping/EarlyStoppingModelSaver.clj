(ns org.deeplearning4j.earlystopping.EarlyStoppingModelSaver
  "Interface for saving MultiLayerNetworks learned during early stopping, and retrieving them again later"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.earlystopping EarlyStoppingModelSaver]))

(defn save-best-model
  "Save the best model (so far) learned during early stopping training

  net - `T`
  score - `double`

  throws: java.io.IOException"
  ([^EarlyStoppingModelSaver this net ^Double score]
    (-> this (.saveBestModel net score))))

(defn save-latest-model
  "Save the latest (most recent) model learned during early stopping

  net - `T`
  score - `double`

  throws: java.io.IOException"
  ([^EarlyStoppingModelSaver this net ^Double score]
    (-> this (.saveLatestModel net score))))

(defn get-best-model
  "Retrieve the best model that was previously saved

  returns: `T`

  throws: java.io.IOException"
  ([^EarlyStoppingModelSaver this]
    (-> this (.getBestModel))))

(defn get-latest-model
  "Retrieve the most recent model that was previously saved

  returns: `T`

  throws: java.io.IOException"
  ([^EarlyStoppingModelSaver this]
    (-> this (.getLatestModel))))

