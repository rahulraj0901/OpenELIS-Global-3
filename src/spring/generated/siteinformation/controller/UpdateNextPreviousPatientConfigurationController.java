package spring.generated.siteinformation.controller;

import java.lang.String;
import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import spring.generated.forms.PatientConfigurationForm;
import spring.mine.common.controller.BaseController;
import spring.mine.common.form.BaseForm;
import spring.mine.common.validator.BaseErrors;

@Controller
public class UpdateNextPreviousPatientConfigurationController extends BaseController {
  @RequestMapping(
      value = "/UpdateNextPreviousPatientConfiguration",
      method = RequestMethod.GET
  )
  public ModelAndView showUpdateNextPreviousPatientConfiguration(HttpServletRequest request) {
    String forward = FWD_SUCCESS;
    PatientConfigurationForm form = new PatientConfigurationForm();
    form.setFormName("PatientConfigurationForm");
    form.setFormAction("");
    BaseErrors errors = new BaseErrors();
    ModelAndView mv = checkUserAndSetup(form, errors, request);

    if (errors.hasErrors()) {
    	return mv;
    }

    return findForward(forward, form);}

  protected ModelAndView findLocalForward(String forward, BaseForm form) {
    if ("success".equals(forward)) {
      return new ModelAndView("/PatientConfiguration.do", "form", form);
    } else if ("fail".equals(forward)) {
      return new ModelAndView("siteInformationDefinition", "form", form);
    } else {
      return new ModelAndView("PageNotFound");
    }
  }

  protected String getPageTitleKey() {
    return null;
  }

  protected String getPageSubtitleKey() {
    return null;
  }
}
