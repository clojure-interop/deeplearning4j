(ns org.nd4j.autodiff.util.cloner.INDArrayFastCloner
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.autodiff.util.cloner INDArrayFastCloner]))

(defn ->ind-array-fast-cloner
  "Constructor."
  (^INDArrayFastCloner []
    (new INDArrayFastCloner )))

(defn clone
  "o - `java.lang.Object`
  i-deep-cloner - `com.rits.cloning.IDeepCloner`
  map - `java.util.Map`

  returns: `java.lang.Object`"
  (^java.lang.Object [^INDArrayFastCloner this ^java.lang.Object o ^com.rits.cloning.IDeepCloner i-deep-cloner ^java.util.Map map]
    (-> this (.clone o i-deep-cloner map))))

