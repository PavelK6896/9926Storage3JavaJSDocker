<template>
  <p>
    {{ info }}
  </p>
  <button @click="getUser">
    getUser
  </button>

</template>

<script>
const url1 = 'http://localhost:8081'

export default {
  name: "HelloWorld",
  data() {
    return {
      info: null
    }
  },
  methods: {
    getUser() {
      fetch(url1).then((d) => d.json()).then(response => (this.info = response))
    }
  }
}
</script>

<style scoped>
a {
  color: #42b983;
}
</style>