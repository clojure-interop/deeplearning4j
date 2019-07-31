(ns org.deeplearning4j.models.embeddings.reader.impl.BasicModelUtils$SimilarityComparator
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.models.embeddings.reader.impl BasicModelUtils$SimilarityComparator]))

(defn ->similarity-comparator
  "Constructor."
  (^BasicModelUtils$SimilarityComparator []
    (new BasicModelUtils$SimilarityComparator )))

(defn compare
  "o-1 - `org.deeplearning4j.models.embeddings.reader.impl.BasicModelUtils$WordSimilarity`
  o-2 - `org.deeplearning4j.models.embeddings.reader.impl.BasicModelUtils$WordSimilarity`

  returns: `int`"
  (^Integer [^BasicModelUtils$SimilarityComparator this ^org.deeplearning4j.models.embeddings.reader.impl.BasicModelUtils$WordSimilarity o-1 ^org.deeplearning4j.models.embeddings.reader.impl.BasicModelUtils$WordSimilarity o-2]
    (-> this (.compare o-1 o-2))))

