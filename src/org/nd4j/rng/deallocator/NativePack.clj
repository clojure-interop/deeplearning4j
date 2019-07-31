(ns org.nd4j.rng.deallocator.NativePack
  "Simple wrapper for state pointer, to avoid enqueue of non-initialized objects"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.rng.deallocator NativePack]))

(defn ->native-pack
  "Constructor."
  (^NativePack []
    (new NativePack )))

