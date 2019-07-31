(ns org.datavec.api.transform.serde.ListWrappers
  "A collection of list wrappers to avoid issues with Jackson losing generic type information and hence
 ignoring the json configuration annotations.
 These are used internally in BaseSerializer and should not be used elsewhere"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.transform.serde ListWrappers]))

