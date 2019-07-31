(ns org.nd4j.autodiff.execution.Node
  "Intermediate Node representation"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.autodiff.execution Node]))

(defn ->node
  "Constructor."
  (^Node []
    (new Node )))

