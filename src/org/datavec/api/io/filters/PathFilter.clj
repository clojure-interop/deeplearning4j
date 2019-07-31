(ns org.datavec.api.io.filters.PathFilter
  "Filters an array of paths in some way."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.io.filters PathFilter]))

(defn filter
  "paths - `java.net.URI[]`

  returns: `java.net.URI[]`"
  ([^PathFilter this paths]
    (-> this (.filter paths))))

