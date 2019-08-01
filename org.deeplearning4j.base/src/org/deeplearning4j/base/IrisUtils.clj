(ns org.deeplearning4j.base.IrisUtils
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.base IrisUtils]))

(defn *load-iris
  "from - `int`
  to - `int`

  returns: `java.util.List<org.nd4j.linalg.dataset.DataSet>`

  throws: java.io.IOException"
  (^java.util.List [^Integer from ^Integer to]
    (IrisUtils/loadIris from to)))

