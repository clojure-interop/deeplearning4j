(ns org.datavec.audio.dsp.WindowFunction
  "Window functions generator"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.audio.dsp WindowFunction]))

(defn ->window-function
  "Constructor."
  (^WindowFunction []
    (new WindowFunction )))

(def *-rectangular
  "Static Constant.

  type: int"
  WindowFunction/RECTANGULAR)

(def *-bartlett
  "Static Constant.

  type: int"
  WindowFunction/BARTLETT)

(def *-hanning
  "Static Constant.

  type: int"
  WindowFunction/HANNING)

(def *-hamming
  "Static Constant.

  type: int"
  WindowFunction/HAMMING)

(def *-blackman
  "Static Constant.

  type: int"
  WindowFunction/BLACKMAN)

(defn set-window-type
  "wt - `int`"
  ([^WindowFunction this ^Integer wt]
    (-> this (.setWindowType wt))))

(defn get-window-type
  "returns: `int`"
  (^Integer [^WindowFunction this]
    (-> this (.getWindowType))))

(defn generate
  "Generate a window

  n-samples - size of the window - `int`

  returns: window in array - `double[]`"
  ([^WindowFunction this ^Integer n-samples]
    (-> this (.generate n-samples))))

