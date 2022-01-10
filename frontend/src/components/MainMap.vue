<template>
  <div class="main-map" ref="map">
  </div>
</template>

<script>
import OlLayerTile from 'ol/layer/Tile.js';
import OlView from 'ol/View.js';
import OlMap from 'ol/Map.js';
import OSM from 'ol/source/OSM';
import {fromLonLat} from 'ol/proj.js'
import {defaults} from 'ol/control.js';

export default {
  name: 'MainMap',
  data() {
    return {
      olMap: undefined,
    }
  },
  methods: {
    init() {
      this.olMap = new OlMap({
        target: this.$refs.map,
        controls : defaults({
          attribution : false,
          zoom : false,
          rotate: false,
        }),
        layers: [
          new OlLayerTile({
            source: new OSM()
          })
        ],
        view: new OlView({
          center: fromLonLat([126.837062, 37.555442]), // 경기도 성남
          zoom: 10
        })
      })
    },
  },
  mounted() {
    this.init();
  }

}
</script>

<style scoped>
.main-map {
  width: 200%;
  height: 100%;
}

</style>
