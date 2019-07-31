(ns org.nd4j.autodiff.util.cloner.DataBufferFastCloner
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.autodiff.util.cloner DataBufferFastCloner]))

(defn ->data-buffer-fast-cloner
  "Constructor."
  (^DataBufferFastCloner []
    (new DataBufferFastCloner )))

(defn clone
  "o - `java.lang.Object`
  i-deep-cloner - `com.rits.cloning.IDeepCloner`
  map - `java.util.Map`

  returns: `java.lang.Object`"
  (^java.lang.Object [^DataBufferFastCloner this ^java.lang.Object o ^com.rits.cloning.IDeepCloner i-deep-cloner ^java.util.Map map]
    (-> this (.clone o i-deep-cloner map))))

