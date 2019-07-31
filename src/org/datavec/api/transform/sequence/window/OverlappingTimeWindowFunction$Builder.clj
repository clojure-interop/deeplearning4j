(ns org.datavec.api.transform.sequence.window.OverlappingTimeWindowFunction$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.transform.sequence.window OverlappingTimeWindowFunction$Builder]))

(defn ->builder
  "Constructor."
  (^OverlappingTimeWindowFunction$Builder []
    (new OverlappingTimeWindowFunction$Builder )))

(defn time-column
  "time-column - `java.lang.String`

  returns: `org.datavec.api.transform.sequence.window.OverlappingTimeWindowFunction$Builder`"
  (^org.datavec.api.transform.sequence.window.OverlappingTimeWindowFunction$Builder [^OverlappingTimeWindowFunction$Builder this ^java.lang.String time-column]
    (-> this (.timeColumn time-column))))

(defn window-size
  "window-size - `long`
  window-size-unit - `java.util.concurrent.TimeUnit`

  returns: `org.datavec.api.transform.sequence.window.OverlappingTimeWindowFunction$Builder`"
  (^org.datavec.api.transform.sequence.window.OverlappingTimeWindowFunction$Builder [^OverlappingTimeWindowFunction$Builder this ^Long window-size ^java.util.concurrent.TimeUnit window-size-unit]
    (-> this (.windowSize window-size window-size-unit))))

(defn window-separation
  "window-separation - `long`
  window-separation-unit - `java.util.concurrent.TimeUnit`

  returns: `org.datavec.api.transform.sequence.window.OverlappingTimeWindowFunction$Builder`"
  (^org.datavec.api.transform.sequence.window.OverlappingTimeWindowFunction$Builder [^OverlappingTimeWindowFunction$Builder this ^Long window-separation ^java.util.concurrent.TimeUnit window-separation-unit]
    (-> this (.windowSeparation window-separation window-separation-unit))))

(defn offset
  "offset-amount - `long`
  offset-unit - `java.util.concurrent.TimeUnit`

  returns: `org.datavec.api.transform.sequence.window.OverlappingTimeWindowFunction$Builder`"
  (^org.datavec.api.transform.sequence.window.OverlappingTimeWindowFunction$Builder [^OverlappingTimeWindowFunction$Builder this ^Long offset-amount ^java.util.concurrent.TimeUnit offset-unit]
    (-> this (.offset offset-amount offset-unit))))

(defn add-window-start-time-column
  "add-window-start-time-column - `boolean`

  returns: `org.datavec.api.transform.sequence.window.OverlappingTimeWindowFunction$Builder`"
  (^org.datavec.api.transform.sequence.window.OverlappingTimeWindowFunction$Builder [^OverlappingTimeWindowFunction$Builder this ^Boolean add-window-start-time-column]
    (-> this (.addWindowStartTimeColumn add-window-start-time-column))))

(defn add-window-end-time-column
  "add-window-end-time-column - `boolean`

  returns: `org.datavec.api.transform.sequence.window.OverlappingTimeWindowFunction$Builder`"
  (^org.datavec.api.transform.sequence.window.OverlappingTimeWindowFunction$Builder [^OverlappingTimeWindowFunction$Builder this ^Boolean add-window-end-time-column]
    (-> this (.addWindowEndTimeColumn add-window-end-time-column))))

(defn exclude-empty-windows
  "exclude-empty-windows - `boolean`

  returns: `org.datavec.api.transform.sequence.window.OverlappingTimeWindowFunction$Builder`"
  (^org.datavec.api.transform.sequence.window.OverlappingTimeWindowFunction$Builder [^OverlappingTimeWindowFunction$Builder this ^Boolean exclude-empty-windows]
    (-> this (.excludeEmptyWindows exclude-empty-windows))))

(defn build
  "returns: `org.datavec.api.transform.sequence.window.OverlappingTimeWindowFunction`"
  (^org.datavec.api.transform.sequence.window.OverlappingTimeWindowFunction [^OverlappingTimeWindowFunction$Builder this]
    (-> this (.build))))

