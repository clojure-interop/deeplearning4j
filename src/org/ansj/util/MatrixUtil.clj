(ns org.ansj.util.MatrixUtil
  (:refer-clojure :only [require comment defn ->])
  (:import [org.ansj.util MatrixUtil]))

(defn ->matrix-util
  "Constructor."
  (^MatrixUtil []
    (new MatrixUtil )))

(defn *sum
  "向量求和

  dbs - `double[]`

  returns: `double`"
  (^Double [dbs]
    (MatrixUtil/sum dbs)))

(defn *dot
  "feature - `double[]`
  feature-1 - `double[]`"
  ([feature feature-1]
    (MatrixUtil/dot feature feature-1)))

