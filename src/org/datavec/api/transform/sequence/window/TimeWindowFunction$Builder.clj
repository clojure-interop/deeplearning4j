(ns org.datavec.api.transform.sequence.window.TimeWindowFunction$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.transform.sequence.window TimeWindowFunction$Builder]))

(defn ->builder
  "Constructor."
  (^TimeWindowFunction$Builder []
    (new TimeWindowFunction$Builder )))

(defn time-column
  "time-column - `java.lang.String`

  returns: `org.datavec.api.transform.sequence.window.TimeWindowFunction$Builder`"
  (^org.datavec.api.transform.sequence.window.TimeWindowFunction$Builder [^TimeWindowFunction$Builder this ^java.lang.String time-column]
    (-> this (.timeColumn time-column))))

(defn window-size
  "window-size - `long`
  window-size-unit - `java.util.concurrent.TimeUnit`

  returns: `org.datavec.api.transform.sequence.window.TimeWindowFunction$Builder`"
  (^org.datavec.api.transform.sequence.window.TimeWindowFunction$Builder [^TimeWindowFunction$Builder this ^Long window-size ^java.util.concurrent.TimeUnit window-size-unit]
    (-> this (.windowSize window-size window-size-unit))))

(defn offset
  "offset-amount - `long`
  offset-unit - `java.util.concurrent.TimeUnit`

  returns: `org.datavec.api.transform.sequence.window.TimeWindowFunction$Builder`"
  (^org.datavec.api.transform.sequence.window.TimeWindowFunction$Builder [^TimeWindowFunction$Builder this ^Long offset-amount ^java.util.concurrent.TimeUnit offset-unit]
    (-> this (.offset offset-amount offset-unit))))

(defn add-window-start-time-column
  "add-window-start-time-column - `boolean`

  returns: `org.datavec.api.transform.sequence.window.TimeWindowFunction$Builder`"
  (^org.datavec.api.transform.sequence.window.TimeWindowFunction$Builder [^TimeWindowFunction$Builder this ^Boolean add-window-start-time-column]
    (-> this (.addWindowStartTimeColumn add-window-start-time-column))))

(defn add-window-end-time-column
  "add-window-end-time-column - `boolean`

  returns: `org.datavec.api.transform.sequence.window.TimeWindowFunction$Builder`"
  (^org.datavec.api.transform.sequence.window.TimeWindowFunction$Builder [^TimeWindowFunction$Builder this ^Boolean add-window-end-time-column]
    (-> this (.addWindowEndTimeColumn add-window-end-time-column))))

(defn exclude-empty-windows
  "exclude-empty-windows - `boolean`

  returns: `org.datavec.api.transform.sequence.window.TimeWindowFunction$Builder`"
  (^org.datavec.api.transform.sequence.window.TimeWindowFunction$Builder [^TimeWindowFunction$Builder this ^Boolean exclude-empty-windows]
    (-> this (.excludeEmptyWindows exclude-empty-windows))))

(defn build
  "returns: `org.datavec.api.transform.sequence.window.TimeWindowFunction`"
  (^org.datavec.api.transform.sequence.window.TimeWindowFunction [^TimeWindowFunction$Builder this]
    (-> this (.build))))

