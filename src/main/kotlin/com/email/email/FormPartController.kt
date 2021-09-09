package com.email.email

import com.email.email.models.FileInfo
import org.springframework.http.MediaType
import org.springframework.ui.ModelMap
import org.springframework.web.bind.annotation.*
import org.springframework.web.multipart.MultipartFile


@RestController
@RequestMapping("/form/data")
class FormPartController {

    @CrossOrigin
    @RequestMapping(value = ["/pdf"], method = [RequestMethod.POST])
    fun submit(@RequestParam("file") file: Array<MultipartFile?>?, modelMap: ModelMap): FileInfo {
        modelMap.addAttribute("files", file)
        val fileInfo = file?.get(0)
        return FileInfo(fileInfo?.originalFilename, fileInfo?.size)
    }

}