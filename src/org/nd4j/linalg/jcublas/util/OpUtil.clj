(ns org.nd4j.linalg.jcublas.util.OpUtil
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.jcublas.util OpUtil]))

(defn *get-op
  "Return op for the given character
  throws an @link{IllegalArgumentException}
  for any charcter != n t or c

  op - the character to get the op for - `char`

  returns: the op for the given character - `int`"
  (^Integer [^Character op]
    (OpUtil/getOp op)))

