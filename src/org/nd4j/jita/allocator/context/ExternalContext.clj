(ns org.nd4j.jita.allocator.context.ExternalContext
  "This is simple class-independant storage for device contexts.
 TODO: Something better then typecast required here"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.jita.allocator.context ExternalContext]))

(defn ->external-context
  "Constructor."
  (^ExternalContext []
    (new ExternalContext )))

