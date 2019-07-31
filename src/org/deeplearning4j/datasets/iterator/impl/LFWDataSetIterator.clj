(ns org.deeplearning4j.datasets.iterator.impl.LFWDataSetIterator
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.datasets.iterator.impl LFWDataSetIterator]))

(defn ->lfw-data-set-iterator
  "Constructor.

  Create LFW data specific iterator

  batch-size - the batch size of the examples - `int`
  num-examples - the overall number of examples - `int`
  img-dim - an array of height, width and channels - `int[]`
  num-labels - the overall number of examples - `int`
  use-subset - use a subset of the LFWDataSet - `boolean`
  label-generator - path label generator to use - `org.datavec.api.io.labels.PathLabelGenerator`
  train - true if use train value - `boolean`
  split-train-test - the percentage to split data for train and remainder goes to test - `double`
  image-transform - how to transform the image - `org.datavec.image.transform.ImageTransform`
  rng - random number to lock in batch shuffling - `java.util.Random`"
  (^LFWDataSetIterator [^Integer batch-size ^Integer num-examples img-dim ^Integer num-labels ^Boolean use-subset ^org.datavec.api.io.labels.PathLabelGenerator label-generator ^Boolean train ^Double split-train-test ^org.datavec.image.transform.ImageTransform image-transform ^java.util.Random rng]
    (new LFWDataSetIterator batch-size num-examples img-dim num-labels use-subset label-generator train split-train-test image-transform rng))
  (^LFWDataSetIterator [^Integer batch-size ^Integer num-examples img-dim ^Integer num-labels ^Boolean use-subset ^org.datavec.api.io.labels.PathLabelGenerator label-generator ^Boolean train ^Double split-train-test ^java.util.Random rng]
    (new LFWDataSetIterator batch-size num-examples img-dim num-labels use-subset label-generator train split-train-test rng))
  (^LFWDataSetIterator [^Integer batch-size ^Integer num-examples img-dim ^Integer num-labels ^Boolean use-subset ^Boolean train ^Double split-train-test ^java.util.Random rng]
    (new LFWDataSetIterator batch-size num-examples img-dim num-labels use-subset train split-train-test rng))
  (^LFWDataSetIterator [^Integer batch-size ^Integer num-examples img-dim ^Boolean train ^Double split-train-test]
    (new LFWDataSetIterator batch-size num-examples img-dim train split-train-test))
  (^LFWDataSetIterator [^Integer batch-size ^Integer num-examples img-dim]
    (new LFWDataSetIterator batch-size num-examples img-dim))
  (^LFWDataSetIterator [^Integer batch-size ^Integer num-examples]
    (new LFWDataSetIterator batch-size num-examples))
  (^LFWDataSetIterator [img-dim]
    (new LFWDataSetIterator img-dim)))

