(ns org.deeplearning4j.spark.models.embeddings.glove.GloveChange
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.spark.models.embeddings.glove GloveChange]))

(defn ->glove-change
  "Constructor.

  w-1 - `org.deeplearning4j.models.word2vec.VocabWord`
  w-2 - `org.deeplearning4j.models.word2vec.VocabWord`
  w-1-update - `org.nd4j.linalg.api.ndarray.INDArray`
  w-2-update - `org.nd4j.linalg.api.ndarray.INDArray`
  w-1-bias-update - `double`
  w-2-bias-update - `double`
  error - `double`
  w-1-history - `org.nd4j.linalg.api.ndarray.INDArray`
  w-2-history - `org.nd4j.linalg.api.ndarray.INDArray`
  w-1-bias-history - `double`
  w-2-bias-history - `double`"
  (^GloveChange [^org.deeplearning4j.models.word2vec.VocabWord w-1 ^org.deeplearning4j.models.word2vec.VocabWord w-2 ^org.nd4j.linalg.api.ndarray.INDArray w-1-update ^org.nd4j.linalg.api.ndarray.INDArray w-2-update ^Double w-1-bias-update ^Double w-2-bias-update ^Double error ^org.nd4j.linalg.api.ndarray.INDArray w-1-history ^org.nd4j.linalg.api.ndarray.INDArray w-2-history ^Double w-1-bias-history ^Double w-2-bias-history]
    (new GloveChange w-1 w-2 w-1-update w-2-update w-1-bias-update w-2-bias-update error w-1-history w-2-history w-1-bias-history w-2-bias-history)))

(defn set-w-2
  "w-2 - `org.deeplearning4j.models.word2vec.VocabWord`"
  ([^GloveChange this ^org.deeplearning4j.models.word2vec.VocabWord w-2]
    (-> this (.setW2 w-2))))

(defn set-w-2-bias-update
  "w-2-bias-update - `double`"
  ([^GloveChange this ^Double w-2-bias-update]
    (-> this (.setW2BiasUpdate w-2-bias-update))))

(defn get-w-2-update
  "returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^GloveChange this]
    (-> this (.getW2Update))))

(defn get-w-2-history
  "returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^GloveChange this]
    (-> this (.getW2History))))

(defn set-w-2-history
  "w-2-history - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^GloveChange this ^org.nd4j.linalg.api.ndarray.INDArray w-2-history]
    (-> this (.setW2History w-2-history))))

(defn get-w-2
  "returns: `org.deeplearning4j.models.word2vec.VocabWord`"
  (^org.deeplearning4j.models.word2vec.VocabWord [^GloveChange this]
    (-> this (.getW2))))

(defn set-w-1-update
  "w-1-update - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^GloveChange this ^org.nd4j.linalg.api.ndarray.INDArray w-1-update]
    (-> this (.setW1Update w-1-update))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^GloveChange this]
    (-> this (.toString))))

(defn set-error
  "error - `double`"
  ([^GloveChange this ^Double error]
    (-> this (.setError error))))

(defn set-w-1-history
  "w-1-history - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^GloveChange this ^org.nd4j.linalg.api.ndarray.INDArray w-1-history]
    (-> this (.setW1History w-1-history))))

(defn apply
  "Apply the changes to the table

  table - `org.deeplearning4j.models.glove.GloveWeightLookupTable`"
  ([^GloveChange this ^org.deeplearning4j.models.glove.GloveWeightLookupTable table]
    (-> this (.apply table))))

(defn get-error
  "returns: `double`"
  (^Double [^GloveChange this]
    (-> this (.getError))))

(defn get-w-1-bias-history
  "returns: `double`"
  (^Double [^GloveChange this]
    (-> this (.getW1BiasHistory))))

(defn set-w-2-update
  "w-2-update - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^GloveChange this ^org.nd4j.linalg.api.ndarray.INDArray w-2-update]
    (-> this (.setW2Update w-2-update))))

(defn get-w-1
  "returns: `org.deeplearning4j.models.word2vec.VocabWord`"
  (^org.deeplearning4j.models.word2vec.VocabWord [^GloveChange this]
    (-> this (.getW1))))

(defn set-w-1-bias-history
  "w-1-bias-history - `double`"
  ([^GloveChange this ^Double w-1-bias-history]
    (-> this (.setW1BiasHistory w-1-bias-history))))

(defn get-w-2-bias-update
  "returns: `double`"
  (^Double [^GloveChange this]
    (-> this (.getW2BiasUpdate))))

(defn set-w-2-bias-history
  "w-2-bias-history - `double`"
  ([^GloveChange this ^Double w-2-bias-history]
    (-> this (.setW2BiasHistory w-2-bias-history))))

(defn set-w-1-bias-update
  "w-1-bias-update - `double`"
  ([^GloveChange this ^Double w-1-bias-update]
    (-> this (.setW1BiasUpdate w-1-bias-update))))

(defn get-w-1-bias-update
  "returns: `double`"
  (^Double [^GloveChange this]
    (-> this (.getW1BiasUpdate))))

(defn get-w-2-bias-history
  "returns: `double`"
  (^Double [^GloveChange this]
    (-> this (.getW2BiasHistory))))

(defn set-w-1
  "w-1 - `org.deeplearning4j.models.word2vec.VocabWord`"
  ([^GloveChange this ^org.deeplearning4j.models.word2vec.VocabWord w-1]
    (-> this (.setW1 w-1))))

(defn get-w-1-update
  "returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^GloveChange this]
    (-> this (.getW1Update))))

(defn get-w-1-history
  "returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^GloveChange this]
    (-> this (.getW1History))))

