(ns org.deeplearning4j.perf.listener.SystemPolling$NameProvider
  "The naming sequence provider.
 This is for allowing generation of naming the output
 according to some semantic sequence (such as a neural net epoch
 or some time stamp)"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.perf.listener SystemPolling$NameProvider]))

(defn next-name
  "returns: `java.lang.String`"
  (^java.lang.String [^SystemPolling$NameProvider this]
    (-> this (.nextName))))

