const base = {
    get() {
        return {
            url : "http://localhost:8080/ssmilxbd/",
            name: "ssmilxbd",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/ssmilxbd/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "红联小区果蔬销售网站"
        } 
    }
}
export default base
