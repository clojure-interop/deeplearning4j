(ns org.deeplearning4j.models.embeddings.loader.WordVectorSerializer$Reader
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.models.embeddings.loader WordVectorSerializer$Reader]))

(defn has-next?
  "returns: `boolean`"
  (^Boolean [^WordVectorSerializer$Reader this]
    (-> this (.hasNext))))

(defn next
  "returns: `org.nd4j.linalg.primitives.Pair<org.deeplearning4j.models.word2vec.VocabWord,float[]>`"
  ([^WordVectorSerializer$Reader this]
    (-> this (.next))))

