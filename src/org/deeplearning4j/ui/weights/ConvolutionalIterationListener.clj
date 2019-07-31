(ns org.deeplearning4j.ui.weights.ConvolutionalIterationListener
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.ui.weights ConvolutionalIterationListener]))

(defn ->convolutional-iteration-listener
  "Constructor.

  ssr - `org.deeplearning4j.api.storage.StatsStorageRouter`
  iterations - `int`
  open-browser - `boolean`
  session-id - `java.lang.String`
  worker-id - `java.lang.String`"
  (^ConvolutionalIterationListener [^org.deeplearning4j.api.storage.StatsStorageRouter ssr ^Integer iterations ^Boolean open-browser ^java.lang.String session-id ^java.lang.String worker-id]
    (new ConvolutionalIterationListener ssr iterations open-browser session-id worker-id))
  (^ConvolutionalIterationListener [^org.deeplearning4j.api.storage.StatsStorageRouter ssr ^Integer iterations ^Boolean open-browser]
    (new ConvolutionalIterationListener ssr iterations open-browser))
  (^ConvolutionalIterationListener [^org.deeplearning4j.ui.UiConnectionInfo connection-info ^Integer visualization-frequency]
    (new ConvolutionalIterationListener connection-info visualization-frequency))
  (^ConvolutionalIterationListener [^Integer visualization-frequency]
    (new ConvolutionalIterationListener visualization-frequency)))

(defn iteration-done
  "Event listener for each iteration

  model - the model iterating - `org.deeplearning4j.nn.api.Model`
  iteration - the iteration number - `int`
  epoch - `int`"
  ([^ConvolutionalIterationListener this ^org.deeplearning4j.nn.api.Model model ^Integer iteration ^Integer epoch]
    (-> this (.iterationDone model iteration epoch))))

