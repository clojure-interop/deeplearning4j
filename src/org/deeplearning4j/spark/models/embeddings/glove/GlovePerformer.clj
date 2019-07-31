(ns org.deeplearning4j.spark.models.embeddings.glove.GlovePerformer
  "Base line glove performer"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.spark.models.embeddings.glove GlovePerformer]))

(defn ->glove-performer
  "Constructor.

  table - `org.deeplearning4j.models.glove.GloveWeightLookupTable`"
  (^GlovePerformer [^org.deeplearning4j.models.glove.GloveWeightLookupTable table]
    (new GlovePerformer table)))

(def *-name-space
  "Static Constant.

  type: java.lang.String"
  GlovePerformer/NAME_SPACE)

(def *-vector-length
  "Static Constant.

  type: java.lang.String"
  GlovePerformer/VECTOR_LENGTH)

(def *-alpha
  "Static Constant.

  type: java.lang.String"
  GlovePerformer/ALPHA)

(def *-x-max
  "Static Constant.

  type: java.lang.String"
  GlovePerformer/X_MAX)

(def *-max-count
  "Static Constant.

  type: java.lang.String"
  GlovePerformer/MAX_COUNT)

(defn call
  "pair - `org.nd4j.linalg.primitives.Triple`

  returns: `org.deeplearning4j.spark.models.embeddings.glove.GloveChange`

  throws: java.lang.Exception"
  (^org.deeplearning4j.spark.models.embeddings.glove.GloveChange [^GlovePerformer this ^org.nd4j.linalg.primitives.Triple pair]
    (-> this (.call pair))))

