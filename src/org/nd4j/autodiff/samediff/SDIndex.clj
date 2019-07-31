(ns org.nd4j.autodiff.samediff.SDIndex
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.autodiff.samediff SDIndex]))

(defn ->sd-index
  "Constructor."
  (^SDIndex []
    (new SDIndex )))

(defn *all
  "returns: `org.nd4j.autodiff.samediff.SDIndex`"
  (^org.nd4j.autodiff.samediff.SDIndex []
    (SDIndex/all )))

(defn *point
  "i - `long`

  returns: `org.nd4j.autodiff.samediff.SDIndex`"
  (^org.nd4j.autodiff.samediff.SDIndex [^Long i]
    (SDIndex/point i)))

(defn *interval
  "begin - `java.lang.Long`
  strides - `java.lang.Long`
  end - `java.lang.Long`

  returns: `org.nd4j.autodiff.samediff.SDIndex`"
  (^org.nd4j.autodiff.samediff.SDIndex [^java.lang.Long begin ^java.lang.Long strides ^java.lang.Long end]
    (SDIndex/interval begin strides end))
  (^org.nd4j.autodiff.samediff.SDIndex [^java.lang.Long begin ^java.lang.Long end]
    (SDIndex/interval begin end)))

