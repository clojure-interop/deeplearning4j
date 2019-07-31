(ns org.datavec.api.io.filters.RandomPathFilter
  "Randomizes the order of paths in an array."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.io.filters RandomPathFilter]))

(defn ->random-path-filter
  "Constructor.

  Constructs an instance of the PathFilter.

  random - object to use - `java.util.Random`
  extensions - of files to keep - `java.lang.String[]`
  max-paths - max number of paths to return (0 == unlimited) - `long`"
  (^RandomPathFilter [^java.util.Random random extensions ^Long max-paths]
    (new RandomPathFilter random extensions max-paths))
  (^RandomPathFilter [^java.util.Random random ^java.lang.String extensions]
    (new RandomPathFilter random extensions)))

(defn filter
  "paths - `java.net.URI[]`

  returns: `java.net.URI[]`"
  ([^RandomPathFilter this paths]
    (-> this (.filter paths))))

