(ns org.deeplearning4j.models.embeddings.loader.WordVectorSerializer$BinaryReader
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.models.embeddings.loader WordVectorSerializer$BinaryReader]))

(defn has-next?
  "returns: `boolean`"
  (^Boolean [^WordVectorSerializer$BinaryReader this]
    (-> this (.hasNext))))

(defn next
  "returns: `org.nd4j.linalg.primitives.Pair<org.deeplearning4j.models.word2vec.VocabWord,float[]>`"
  ([^WordVectorSerializer$BinaryReader this]
    (-> this (.next))))

(defn close
  "throws: java.lang.Exception"
  ([^WordVectorSerializer$BinaryReader this]
    (-> this (.close))))

