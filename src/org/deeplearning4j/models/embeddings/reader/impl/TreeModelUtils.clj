(ns org.deeplearning4j.models.embeddings.reader.impl.TreeModelUtils
  "This is VPTree-based implementation for wordsNearest method, suited for multiple consequent calls.
 Please note: VPTree will take some memory, dependant on your model size."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.models.embeddings.reader.impl TreeModelUtils]))

(defn ->tree-model-utils
  "Constructor."
  (^TreeModelUtils []
    (new TreeModelUtils )))

(defn init
  "Description copied from interface: ModelUtils

  lookup-table - `org.deeplearning4j.models.embeddings.WeightLookupTable`"
  ([^TreeModelUtils this ^org.deeplearning4j.models.embeddings.WeightLookupTable lookup-table]
    (-> this (.init lookup-table))))

(defn words-nearest
  "Description copied from interface: ModelUtils

  positive - the positive words - `java.util.Collection`
  negative - the negative words - `java.util.Collection`
  top - the top n words - `int`

  returns: the words nearest the mean of the words - `java.util.Collection<java.lang.String>`"
  (^java.util.Collection [^TreeModelUtils this ^java.util.Collection positive ^java.util.Collection negative ^Integer top]
    (-> this (.wordsNearest positive negative top)))
  (^java.util.Collection [^TreeModelUtils this ^java.lang.String label ^Integer n]
    (-> this (.wordsNearest label n))))

