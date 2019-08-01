(ns org.deeplearning4j.util.ThreadUtils$UncheckedInterruptedException
  "Similar to InterruptedException in concept, but unchecked. Allowing this to be thrown without being
 explicitly declared in the API."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.util ThreadUtils$UncheckedInterruptedException]))

(defn ->unchecked-interrupted-exception
  "Constructor."
  (^ThreadUtils$UncheckedInterruptedException []
    (new ThreadUtils$UncheckedInterruptedException )))

