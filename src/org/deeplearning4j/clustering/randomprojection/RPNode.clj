(ns org.deeplearning4j.clustering.randomprojection.RPNode
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.clustering.randomprojection RPNode]))

(defn ->rp-node
  "Constructor.

  tree - `org.deeplearning4j.clustering.randomprojection.RPTree`
  depth - `int`"
  (^RPNode [^org.deeplearning4j.clustering.randomprojection.RPTree tree ^Integer depth]
    (new RPNode tree depth)))

