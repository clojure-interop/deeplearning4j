(ns org.datavec.local.transforms.misc.SumLongsFunction2
  "Created by Alex on 03/09/2016."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.local.transforms.misc SumLongsFunction2]))

(defn ->sum-longs-function-2
  "Constructor."
  (^SumLongsFunction2 []
    (new SumLongsFunction2 )))

(defn apply
  "Description copied from interface: Function

  input - Input - `org.nd4j.linalg.primitives.Pair`

  returns: Result - `java.lang.Long`"
  (^java.lang.Long [^SumLongsFunction2 this ^org.nd4j.linalg.primitives.Pair input]
    (-> this (.apply input))))

